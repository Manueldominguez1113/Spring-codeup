const client = filestack.init(APIKEY);
const options = {

    maxSize: 10 * 1024 * 1024,
    accept: 'image/*',
    uploadInBackground: false,
};

client.picker(options).open();
