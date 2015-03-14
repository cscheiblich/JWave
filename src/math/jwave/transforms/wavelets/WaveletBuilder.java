/**
 * Create Wavelet objects ...
 *
 * @author Christian Scheiblich (cscheiblich@gmail.com)
 * @date 14.03.2015 13:50:30 
 *
 * WaveletBuilder.java
 */
package math.jwave.transforms.wavelets;

import math.jwave.exceptions.JWaveFailure;
import math.jwave.transforms.wavelets.biorthogonal.BiOrthogonal11;
import math.jwave.transforms.wavelets.biorthogonal.BiOrthogonal13;
import math.jwave.transforms.wavelets.biorthogonal.BiOrthogonal15;
import math.jwave.transforms.wavelets.biorthogonal.BiOrthogonal22;
import math.jwave.transforms.wavelets.biorthogonal.BiOrthogonal24;
import math.jwave.transforms.wavelets.biorthogonal.BiOrthogonal26;
import math.jwave.transforms.wavelets.biorthogonal.BiOrthogonal28;
import math.jwave.transforms.wavelets.biorthogonal.BiOrthogonal31;
import math.jwave.transforms.wavelets.biorthogonal.BiOrthogonal33;
import math.jwave.transforms.wavelets.biorthogonal.BiOrthogonal35;
import math.jwave.transforms.wavelets.biorthogonal.BiOrthogonal37;
import math.jwave.transforms.wavelets.biorthogonal.BiOrthogonal39;
import math.jwave.transforms.wavelets.biorthogonal.BiOrthogonal44;
import math.jwave.transforms.wavelets.biorthogonal.BiOrthogonal55;
import math.jwave.transforms.wavelets.biorthogonal.BiOrthogonal68;
import math.jwave.transforms.wavelets.coiflet.Coiflet1;
import math.jwave.transforms.wavelets.coiflet.Coiflet2;
import math.jwave.transforms.wavelets.coiflet.Coiflet3;
import math.jwave.transforms.wavelets.coiflet.Coiflet4;
import math.jwave.transforms.wavelets.coiflet.Coiflet5;
import math.jwave.transforms.wavelets.daubechies.Daubechies10;
import math.jwave.transforms.wavelets.daubechies.Daubechies11;
import math.jwave.transforms.wavelets.daubechies.Daubechies12;
import math.jwave.transforms.wavelets.daubechies.Daubechies13;
import math.jwave.transforms.wavelets.daubechies.Daubechies14;
import math.jwave.transforms.wavelets.daubechies.Daubechies15;
import math.jwave.transforms.wavelets.daubechies.Daubechies16;
import math.jwave.transforms.wavelets.daubechies.Daubechies17;
import math.jwave.transforms.wavelets.daubechies.Daubechies18;
import math.jwave.transforms.wavelets.daubechies.Daubechies19;
import math.jwave.transforms.wavelets.daubechies.Daubechies2;
import math.jwave.transforms.wavelets.daubechies.Daubechies20;
import math.jwave.transforms.wavelets.daubechies.Daubechies3;
import math.jwave.transforms.wavelets.daubechies.Daubechies4;
import math.jwave.transforms.wavelets.daubechies.Daubechies5;
import math.jwave.transforms.wavelets.daubechies.Daubechies6;
import math.jwave.transforms.wavelets.daubechies.Daubechies7;
import math.jwave.transforms.wavelets.daubechies.Daubechies8;
import math.jwave.transforms.wavelets.daubechies.Daubechies9;
import math.jwave.transforms.wavelets.haar.Haar1;
import math.jwave.transforms.wavelets.haar.Haar1Orthogonal;
import math.jwave.transforms.wavelets.legendre.Legendre1;
import math.jwave.transforms.wavelets.legendre.Legendre2;
import math.jwave.transforms.wavelets.legendre.Legendre3;
import math.jwave.transforms.wavelets.other.DiscreteMayer;
import math.jwave.transforms.wavelets.symlets.Symlet10;
import math.jwave.transforms.wavelets.symlets.Symlet11;
import math.jwave.transforms.wavelets.symlets.Symlet12;
import math.jwave.transforms.wavelets.symlets.Symlet13;
import math.jwave.transforms.wavelets.symlets.Symlet14;
import math.jwave.transforms.wavelets.symlets.Symlet15;
import math.jwave.transforms.wavelets.symlets.Symlet16;
import math.jwave.transforms.wavelets.symlets.Symlet17;
import math.jwave.transforms.wavelets.symlets.Symlet18;
import math.jwave.transforms.wavelets.symlets.Symlet19;
import math.jwave.transforms.wavelets.symlets.Symlet2;
import math.jwave.transforms.wavelets.symlets.Symlet20;
import math.jwave.transforms.wavelets.symlets.Symlet3;
import math.jwave.transforms.wavelets.symlets.Symlet4;
import math.jwave.transforms.wavelets.symlets.Symlet5;
import math.jwave.transforms.wavelets.symlets.Symlet6;
import math.jwave.transforms.wavelets.symlets.Symlet7;
import math.jwave.transforms.wavelets.symlets.Symlet8;
import math.jwave.transforms.wavelets.symlets.Symlet9;

/**
 * Class for creating and identifying Wavelet object.
 * 
 * @author Christian Scheiblich (cscheiblich@gmail.com)
 * @date 14.03.2015 13:50:30
 */
public class WaveletBuilder {

    /**
   * Create a Wavelet object by string. Look into each Wavelet for matching
   * string identifier.
   * 
   * @author Christian Scheiblich (cscheiblich@gmail.com)
   * @date 14.03.2015 14:19:09
   * @param name
   *          identifier as stored in Wavelet object
   * @return a matching object of type Wavelet
   * @throws JWaveFailure
   *           if string is not valid or Wavelet is broken yet
   */
  static public Wavelet create( String name ) throws JWaveFailure {

    Wavelet wavelet = null;

    switch( name ){

      case "Haar":
        wavelet = new Haar1( );
        break;

      case "Haar orthogonal":
        wavelet = new Haar1Orthogonal( );
        break;

      case "Daubechies 2":
        wavelet = new Daubechies2( );
        break;

      case "Daubechies 3":
        wavelet = new Daubechies3( );
        break;

      case "Daubechies 4":
        wavelet = new Daubechies4( );
        break;

      case "Daubechies 5":
        wavelet = new Daubechies5( );
        break;

      case "Daubechies 6":
        wavelet = new Daubechies6( );
        break;

      case "Daubechies 7":
        wavelet = new Daubechies7( );
        break;

      case "Daubechies 8":
        wavelet = new Daubechies8( );
        break;

      case "Daubechies 9":
        wavelet = new Daubechies9( );
        break;

      case "Daubechies 10":
        wavelet = new Daubechies10( );
        break;

      case "Daubechies 11":
        wavelet = new Daubechies11( );
        break;

      case "Daubechies 12":
        wavelet = new Daubechies12( );
        break;

      case "Daubechies 13":
        wavelet = new Daubechies13( );
        break;

      case "Daubechies 14":
        wavelet = new Daubechies14( );
        break;

      case "Daubechies 15":
        wavelet = new Daubechies15( );
        break;

      case "Daubechies 16":
        wavelet = new Daubechies16( );
        break;

      case "Daubechies 17":
        wavelet = new Daubechies17( );
        break;

      case "Daubechies 18":
        wavelet = new Daubechies18( );
        break;

      case "Daubechies 19":
        wavelet = new Daubechies19( );
        break;

      case "Daubechies 20":
        wavelet = new Daubechies20( );
        break;

      case "Coiflet 1":
        wavelet = new Coiflet1( );
        break;

      case "Coiflet 2":
        wavelet = new Coiflet2( );
        break;

      case "Coiflet 3":
        wavelet = new Coiflet3( );
        break;

      case "Coiflet 4":
        wavelet = new Coiflet4( );
        break;

      case "Coiflet 5":
        wavelet = new Coiflet5( );
        break;

      case "Legendre 1":
        wavelet = new Legendre1( );
        break;

      case "Legendre 2":
        wavelet = new Legendre2( );
        break;

      case "Legendre 3":
        wavelet = new Legendre3( );
        break;

      case "Symlet 2":
        wavelet = new Symlet2( );
        break;

      case "Symlet 3":
        wavelet = new Symlet3( );
        break;

      case "Symlet 4":
        wavelet = new Symlet4( );
        break;

      case "Symlet 5":
        wavelet = new Symlet5( );
        break;

      case "Symlet 6":
        wavelet = new Symlet6( );
        break;

      case "Symlet 7":
        wavelet = new Symlet7( );
        break;

      case "Symlet 8":
        wavelet = new Symlet8( );
        break;

      case "Symlet 9":
        wavelet = new Symlet9( );
        break;

      case "Symlet 10":
        wavelet = new Symlet10( );
        break;

      case "Symlet 11":
        wavelet = new Symlet11( );
        break;

      case "Symlet 12":
        wavelet = new Symlet12( );
        break;

      case "Symlet 13":
        wavelet = new Symlet13( );
        break;

      case "Symlet 14":
        wavelet = new Symlet14( );
        break;

      case "Symlet 15":
        wavelet = new Symlet15( );
        break;

      case "Symlet 16":
        wavelet = new Symlet16( );
        break;

      case "Symlet 17":
        wavelet = new Symlet17( );
        break;

      case "Symlet 18":
        wavelet = new Symlet18( );
        break;

      case "Symlet 19":
        wavelet = new Symlet19( );
        break;

      case "Symlet 20":
        wavelet = new Symlet20( );
        break;

      case "BiOrthogonal 1/1":
        wavelet = new BiOrthogonal11( );
        break;

      case "BiOrthogonal 1/3":
        wavelet = new BiOrthogonal13( );
        break;

      case "BiOrthogonal 1/5":
        wavelet = new BiOrthogonal15( );
        break;

      case "BiOrthogonal 2/2":
        wavelet = new BiOrthogonal22( );
        break;

      case "BiOrthogonal 2/4":
        wavelet = new BiOrthogonal24( );
        break;

      case "BiOrthogonal 2/6":
        wavelet = new BiOrthogonal26( );
        break;

      case "BiOrthogonal 2/8":
        wavelet = new BiOrthogonal28( );
        break;

      case "BiOrthogonal 3/1":
        wavelet = new BiOrthogonal31( );
        break;

      case "BiOrthogonal 3/3":
        wavelet = new BiOrthogonal33( );
        break;

      case "BiOrthogonal 3/5":
        wavelet = new BiOrthogonal35( );
        break;

      case "BiOrthogonal 3/7":
        wavelet = new BiOrthogonal37( );
        break;

      case "BiOrthogonal 3/9":
        wavelet = new BiOrthogonal39( );
        break;

      case "BiOrthogonal 4/4":
        wavelet = new BiOrthogonal44( );
        break;

      case "BiOrthogonal 5/5":
        wavelet = new BiOrthogonal55( );
        break;

      case "BiOrthogonal 6/8":
        wavelet = new BiOrthogonal68( );
        break;

      case "Discrete Mayer":
        wavelet = new DiscreteMayer( );
        break;

      case "Battle 23":
        // wavelet = new Battle23( );
        throw new JWaveFailure(
            "WaveletBuilder::create - Battle23 - "
                + "This wavelet has an odd number of coefficients, "
                + "due to that it is not comaptible to the implemented algorithms; somehow!" );
        // break;

      case "CDF 5/3":
        // wavelet = new CDF53( );
        throw new JWaveFailure(
            "WaveletBuilder::create - CDF 5/3 - "
                + "This wavelet has an odd number of coefficients, "
                + "due to that it is not comaptible to the implemented algorithms; somehow!" );
        // break;

      case "CDF 9/7":
        // wavelet = new CDF97( );
        throw new JWaveFailure(
            "WaveletBuilder::create - CDF 9/7 - "
                + "This wavelet has an odd number of coefficients, "
                + "due to that it is not comaptible to the implemented algorithms; somehow!" );
        // break;

      default:

        throw new JWaveFailure(
            "WaveletBuilder::create - unknown type of wavelet for given string!" );

    } // switch

    return wavelet;

  } // create

  /**
   * Returns the identifier string of a given Wavelet object.
   * 
   * @author Christian Scheiblich (cscheiblich@gmail.com)
   * @date 14.03.2015 14:22:22
   * @param wavelet
   *          an object of type Wavelet
   * @return identifier string of givn Wavelet
   */
  static public String identify( Wavelet wavelet ) {

    return wavelet.getName( );

  } // identify

} // class