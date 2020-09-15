home=$(pwd)
cd pilotpaydb || echo 'can not find pilotpaydb' exit 1
docker build -t pilotpaydb:1 .

cd "$home" || exit 1
for dir in discovery persistance reverseproxy; do
  echo building $dir...
  cd $dir || exit 1
  ./mvnw clean install || exit 1
  cd "$home" || exit 1
done
