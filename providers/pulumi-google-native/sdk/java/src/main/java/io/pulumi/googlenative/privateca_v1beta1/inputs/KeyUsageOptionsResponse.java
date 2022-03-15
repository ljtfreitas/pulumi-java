// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * KeyUsage.KeyUsageOptions corresponds to the key usage values described in https://tools.ietf.org/html/rfc5280#section-4.2.1.3.
 * 
 */
public final class KeyUsageOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final KeyUsageOptionsResponse Empty = new KeyUsageOptionsResponse();

    /**
     * The key may be used to sign certificates.
     * 
     */
    @Import(name="certSign", required=true)
      private final Boolean certSign;

    public Boolean getCertSign() {
        return this.certSign;
    }

    /**
     * The key may be used for cryptographic commitments. Note that this may also be referred to as "non-repudiation".
     * 
     */
    @Import(name="contentCommitment", required=true)
      private final Boolean contentCommitment;

    public Boolean getContentCommitment() {
        return this.contentCommitment;
    }

    /**
     * The key may be used sign certificate revocation lists.
     * 
     */
    @Import(name="crlSign", required=true)
      private final Boolean crlSign;

    public Boolean getCrlSign() {
        return this.crlSign;
    }

    /**
     * The key may be used to encipher data.
     * 
     */
    @Import(name="dataEncipherment", required=true)
      private final Boolean dataEncipherment;

    public Boolean getDataEncipherment() {
        return this.dataEncipherment;
    }

    /**
     * The key may be used to decipher only.
     * 
     */
    @Import(name="decipherOnly", required=true)
      private final Boolean decipherOnly;

    public Boolean getDecipherOnly() {
        return this.decipherOnly;
    }

    /**
     * The key may be used for digital signatures.
     * 
     */
    @Import(name="digitalSignature", required=true)
      private final Boolean digitalSignature;

    public Boolean getDigitalSignature() {
        return this.digitalSignature;
    }

    /**
     * The key may be used to encipher only.
     * 
     */
    @Import(name="encipherOnly", required=true)
      private final Boolean encipherOnly;

    public Boolean getEncipherOnly() {
        return this.encipherOnly;
    }

    /**
     * The key may be used in a key agreement protocol.
     * 
     */
    @Import(name="keyAgreement", required=true)
      private final Boolean keyAgreement;

    public Boolean getKeyAgreement() {
        return this.keyAgreement;
    }

    /**
     * The key may be used to encipher other keys.
     * 
     */
    @Import(name="keyEncipherment", required=true)
      private final Boolean keyEncipherment;

    public Boolean getKeyEncipherment() {
        return this.keyEncipherment;
    }

    public KeyUsageOptionsResponse(
        Boolean certSign,
        Boolean contentCommitment,
        Boolean crlSign,
        Boolean dataEncipherment,
        Boolean decipherOnly,
        Boolean digitalSignature,
        Boolean encipherOnly,
        Boolean keyAgreement,
        Boolean keyEncipherment) {
        this.certSign = Objects.requireNonNull(certSign, "expected parameter 'certSign' to be non-null");
        this.contentCommitment = Objects.requireNonNull(contentCommitment, "expected parameter 'contentCommitment' to be non-null");
        this.crlSign = Objects.requireNonNull(crlSign, "expected parameter 'crlSign' to be non-null");
        this.dataEncipherment = Objects.requireNonNull(dataEncipherment, "expected parameter 'dataEncipherment' to be non-null");
        this.decipherOnly = Objects.requireNonNull(decipherOnly, "expected parameter 'decipherOnly' to be non-null");
        this.digitalSignature = Objects.requireNonNull(digitalSignature, "expected parameter 'digitalSignature' to be non-null");
        this.encipherOnly = Objects.requireNonNull(encipherOnly, "expected parameter 'encipherOnly' to be non-null");
        this.keyAgreement = Objects.requireNonNull(keyAgreement, "expected parameter 'keyAgreement' to be non-null");
        this.keyEncipherment = Objects.requireNonNull(keyEncipherment, "expected parameter 'keyEncipherment' to be non-null");
    }

    private KeyUsageOptionsResponse() {
        this.certSign = null;
        this.contentCommitment = null;
        this.crlSign = null;
        this.dataEncipherment = null;
        this.decipherOnly = null;
        this.digitalSignature = null;
        this.encipherOnly = null;
        this.keyAgreement = null;
        this.keyEncipherment = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyUsageOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean certSign;
        private Boolean contentCommitment;
        private Boolean crlSign;
        private Boolean dataEncipherment;
        private Boolean decipherOnly;
        private Boolean digitalSignature;
        private Boolean encipherOnly;
        private Boolean keyAgreement;
        private Boolean keyEncipherment;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyUsageOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certSign = defaults.certSign;
    	      this.contentCommitment = defaults.contentCommitment;
    	      this.crlSign = defaults.crlSign;
    	      this.dataEncipherment = defaults.dataEncipherment;
    	      this.decipherOnly = defaults.decipherOnly;
    	      this.digitalSignature = defaults.digitalSignature;
    	      this.encipherOnly = defaults.encipherOnly;
    	      this.keyAgreement = defaults.keyAgreement;
    	      this.keyEncipherment = defaults.keyEncipherment;
        }

        public Builder certSign(Boolean certSign) {
            this.certSign = Objects.requireNonNull(certSign);
            return this;
        }

        public Builder contentCommitment(Boolean contentCommitment) {
            this.contentCommitment = Objects.requireNonNull(contentCommitment);
            return this;
        }

        public Builder crlSign(Boolean crlSign) {
            this.crlSign = Objects.requireNonNull(crlSign);
            return this;
        }

        public Builder dataEncipherment(Boolean dataEncipherment) {
            this.dataEncipherment = Objects.requireNonNull(dataEncipherment);
            return this;
        }

        public Builder decipherOnly(Boolean decipherOnly) {
            this.decipherOnly = Objects.requireNonNull(decipherOnly);
            return this;
        }

        public Builder digitalSignature(Boolean digitalSignature) {
            this.digitalSignature = Objects.requireNonNull(digitalSignature);
            return this;
        }

        public Builder encipherOnly(Boolean encipherOnly) {
            this.encipherOnly = Objects.requireNonNull(encipherOnly);
            return this;
        }

        public Builder keyAgreement(Boolean keyAgreement) {
            this.keyAgreement = Objects.requireNonNull(keyAgreement);
            return this;
        }

        public Builder keyEncipherment(Boolean keyEncipherment) {
            this.keyEncipherment = Objects.requireNonNull(keyEncipherment);
            return this;
        }
        public KeyUsageOptionsResponse build() {
            return new KeyUsageOptionsResponse(certSign, contentCommitment, crlSign, dataEncipherment, decipherOnly, digitalSignature, encipherOnly, keyAgreement, keyEncipherment);
        }
    }
}
