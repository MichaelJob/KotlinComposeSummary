###Emulator Tipps&Tricks

#Internet connectivity
While it is necessary to have the internet access permissions set in your android manifest (AndroidManifest.xml)
make sure that your emulator has the correct date and time set (should be automatically taken over from your machine anyways, but can fail to do so) otherwise access to net resources may fail, because of the wrong timestamp. Your app may then just fail to call an API and you wonder what you have missed, but it is just your emulator not being able to make the request.

#Layout
Because of screen resolutions and scale-dependent Pixels it is recommended to test your layout not exclusivley in the emulator. Make sure to also have a look on a real device early on.

#Run your app multiple times
If you want to test your app, say a chat app, you can run one in the emulator and one on your real device from the same Android Studio Window. Just start on both enviroments. You can even select multiple devices at once and then start them all together. If you have several Android Studio Windows open (with different projects), your virtual device in the emulator is a singel instance, so it shows the same app in every window. If you want to run different apps emulated, you need a virtual device for every instance. Go to AVD Android Virtual Device Manager and create another virtual device. You can dublicate the existing and give appropriate names. Of course you can also create different virtual devices to test on different screen sizes and or other settings.

#GPS Location
You can set the emulators GPS Location to simulate any Location. If your app uses the GPS, make sure to start Google Maps an locate the emulator once before trying it in your app. Somehow the emulator needs this as to be able to handle GPS Location requests thereafter.