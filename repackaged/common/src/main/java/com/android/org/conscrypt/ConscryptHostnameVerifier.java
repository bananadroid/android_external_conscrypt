/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.conscrypt;

import javax.net.ssl.SSLSession;

/**
 * This interface is used to implement hostname verification in Conscrypt.  Unlike with
 * {@link javax.net.ssl.HostnameVerifier}, the hostname verifier is called whenever hostname
 * verification is needed, without any use of default rules.
 * @hide This class is not part of the Android public SDK API
 */
public interface ConscryptHostnameVerifier {

  /**
   * Returns whether the given hostname is allowable given the peer's authentication information
   * from the given session.
   */
  boolean verify(String hostname, SSLSession session);

}
