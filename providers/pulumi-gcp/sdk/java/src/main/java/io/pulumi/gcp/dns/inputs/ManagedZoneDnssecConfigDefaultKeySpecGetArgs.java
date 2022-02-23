// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dns.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedZoneDnssecConfigDefaultKeySpecGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedZoneDnssecConfigDefaultKeySpecGetArgs Empty = new ManagedZoneDnssecConfigDefaultKeySpecGetArgs();

    /**
     * String mnemonic specifying the DNSSEC algorithm of this key
     * Possible values are `ecdsap256sha256`, `ecdsap384sha384`, `rsasha1`, `rsasha256`, and `rsasha512`.
     * 
     */
    @InputImport(name="algorithm")
        private final @Nullable Input<String> algorithm;

    public Input<String> getAlgorithm() {
        return this.algorithm == null ? Input.empty() : this.algorithm;
    }

    /**
     * Length of the keys in bits
     * 
     */
    @InputImport(name="keyLength")
        private final @Nullable Input<Integer> keyLength;

    public Input<Integer> getKeyLength() {
        return this.keyLength == null ? Input.empty() : this.keyLength;
    }

    /**
     * Specifies whether this is a key signing key (KSK) or a zone
     * signing key (ZSK). Key signing keys have the Secure Entry
     * Point flag set and, when active, will only be used to sign
     * resource record sets of type DNSKEY. Zone signing keys do
     * not have the Secure Entry Point flag set and will be used
     * to sign all other types of resource record sets.
     * Possible values are `keySigning` and `zoneSigning`.
     * 
     */
    @InputImport(name="keyType")
        private final @Nullable Input<String> keyType;

    public Input<String> getKeyType() {
        return this.keyType == null ? Input.empty() : this.keyType;
    }

    /**
     * Identifies what kind of resource this is
     * 
     */
    @InputImport(name="kind")
        private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    public ManagedZoneDnssecConfigDefaultKeySpecGetArgs(
        @Nullable Input<String> algorithm,
        @Nullable Input<Integer> keyLength,
        @Nullable Input<String> keyType,
        @Nullable Input<String> kind) {
        this.algorithm = algorithm;
        this.keyLength = keyLength;
        this.keyType = keyType;
        this.kind = kind;
    }

    private ManagedZoneDnssecConfigDefaultKeySpecGetArgs() {
        this.algorithm = Input.empty();
        this.keyLength = Input.empty();
        this.keyType = Input.empty();
        this.kind = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZoneDnssecConfigDefaultKeySpecGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> algorithm;
        private @Nullable Input<Integer> keyLength;
        private @Nullable Input<String> keyType;
        private @Nullable Input<String> kind;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZoneDnssecConfigDefaultKeySpecGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.keyLength = defaults.keyLength;
    	      this.keyType = defaults.keyType;
    	      this.kind = defaults.kind;
        }

        public Builder setAlgorithm(@Nullable Input<String> algorithm) {
            this.algorithm = algorithm;
            return this;
        }

        public Builder setAlgorithm(@Nullable String algorithm) {
            this.algorithm = Input.ofNullable(algorithm);
            return this;
        }

        public Builder setKeyLength(@Nullable Input<Integer> keyLength) {
            this.keyLength = keyLength;
            return this;
        }

        public Builder setKeyLength(@Nullable Integer keyLength) {
            this.keyLength = Input.ofNullable(keyLength);
            return this;
        }

        public Builder setKeyType(@Nullable Input<String> keyType) {
            this.keyType = keyType;
            return this;
        }

        public Builder setKeyType(@Nullable String keyType) {
            this.keyType = Input.ofNullable(keyType);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }
        public ManagedZoneDnssecConfigDefaultKeySpecGetArgs build() {
            return new ManagedZoneDnssecConfigDefaultKeySpecGetArgs(algorithm, keyLength, keyType, kind);
        }
    }
}
