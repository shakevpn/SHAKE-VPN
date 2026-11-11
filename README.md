# SHAKE VPN — Android starter project

This is the initial Android UI prototype for SHAKE VPN.

## Included
- Pink/red SHAKE branding
- White/blue Android interface
- Bangladesh, United Kingdom, United States and Germany server selector
- GitHub Actions workflow to build a debug APK in the cloud

## Important: not a functioning VPN yet
The Connect button is intentionally marked DEMO ONLY. No VPN tunnel is implemented,
no VPN server credentials are included, and no user traffic is routed. Do not describe
this prototype as a working VPN or publish it as a functioning VPN service.

## Build using an Android phone
1. Create/sign in to a GitHub account at https://github.com.
2. Create a new public or private repository named `SHAKE-VPN`.
3. Upload the contents of this project ZIP to the repository (extract it first).
4. Open the repository's Actions tab.
5. Enable Actions if GitHub asks.
6. Run `Build SHAKE VPN Android APK` using Run workflow, or push a commit to `main`.
7. Open the successful workflow run and download the `SHAKE-VPN-debug` artifact.
8. Extract the artifact ZIP and install `app-debug.apk` on your Android phone.
   You may need to allow installation from your browser or file manager.

## Before a real VPN release
A production version still needs:
- Four actual VPN servers and verified hosting locations
- WireGuard tunnel integration and per-user configuration provisioning
- Secure key handling and server-side access management
- A foreground VPN service, connection lifecycle handling and leak protection
- Privacy policy, data safety declarations, VPNService declaration and security tests
- Release signing, store listing, and Google Play review

Never upload private WireGuard keys, server passwords, or signing keys to a public repository.
