// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SignatureResponse {
    /**
     * @return The identifier for the public key that verifies this signature. * The `public_key_id` is required. * The `public_key_id` SHOULD be an RFC3986 conformant URI. * When possible, the `public_key_id` SHOULD be an immutable reference, such as a cryptographic digest. Examples of valid `public_key_id`s: OpenPGP V4 public key fingerprint: * &#34;openpgp4fpr:74FAF3B861BDA0870C7B6DEF607E48D2A663AEEA&#34; See https://www.iana.org/assignments/uri-schemes/prov/openpgp4fpr for more details on this scheme. RFC6920 digest-named SubjectPublicKeyInfo (digest of the DER serialization): * &#34;ni:///sha-256;cD9o9Cq6LG3jD0iKXqEi_vdjJGecm_iXkbqVoScViaU&#34; * &#34;nih:///sha-256;703f68f42aba2c6de30f488a5ea122fef76324679c9bf89791ba95a1271589a5&#34;
     * 
     */
    private final String publicKeyId;
    /**
     * @return The content of the signature, an opaque bytestring. The payload that this signature verifies MUST be unambiguously provided with the Signature during verification. A wrapper message might provide the payload explicitly. Alternatively, a message might have a canonical serialization that can always be unambiguously computed to derive the payload.
     * 
     */
    private final String signature;

    @CustomType.Constructor
    private SignatureResponse(
        @CustomType.Parameter("publicKeyId") String publicKeyId,
        @CustomType.Parameter("signature") String signature) {
        this.publicKeyId = publicKeyId;
        this.signature = signature;
    }

    /**
     * @return The identifier for the public key that verifies this signature. * The `public_key_id` is required. * The `public_key_id` SHOULD be an RFC3986 conformant URI. * When possible, the `public_key_id` SHOULD be an immutable reference, such as a cryptographic digest. Examples of valid `public_key_id`s: OpenPGP V4 public key fingerprint: * &#34;openpgp4fpr:74FAF3B861BDA0870C7B6DEF607E48D2A663AEEA&#34; See https://www.iana.org/assignments/uri-schemes/prov/openpgp4fpr for more details on this scheme. RFC6920 digest-named SubjectPublicKeyInfo (digest of the DER serialization): * &#34;ni:///sha-256;cD9o9Cq6LG3jD0iKXqEi_vdjJGecm_iXkbqVoScViaU&#34; * &#34;nih:///sha-256;703f68f42aba2c6de30f488a5ea122fef76324679c9bf89791ba95a1271589a5&#34;
     * 
     */
    public String publicKeyId() {
        return this.publicKeyId;
    }
    /**
     * @return The content of the signature, an opaque bytestring. The payload that this signature verifies MUST be unambiguously provided with the Signature during verification. A wrapper message might provide the payload explicitly. Alternatively, a message might have a canonical serialization that can always be unambiguously computed to derive the payload.
     * 
     */
    public String signature() {
        return this.signature;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SignatureResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String publicKeyId;
        private String signature;

        public Builder() {
    	      // Empty
        }

        public Builder(SignatureResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicKeyId = defaults.publicKeyId;
    	      this.signature = defaults.signature;
        }

        public Builder publicKeyId(String publicKeyId) {
            this.publicKeyId = Objects.requireNonNull(publicKeyId);
            return this;
        }
        public Builder signature(String signature) {
            this.signature = Objects.requireNonNull(signature);
            return this;
        }        public SignatureResponse build() {
            return new SignatureResponse(publicKeyId, signature);
        }
    }
}
