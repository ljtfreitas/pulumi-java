// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dns.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="algorithm")
      private final @Nullable Output<String> algorithm;

    public Output<String> getAlgorithm() {
        return this.algorithm == null ? Output.empty() : this.algorithm;
    }

    /**
     * Length of the keys in bits
     * 
     */
    @Import(name="keyLength")
      private final @Nullable Output<Integer> keyLength;

    public Output<Integer> getKeyLength() {
        return this.keyLength == null ? Output.empty() : this.keyLength;
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
    @Import(name="keyType")
      private final @Nullable Output<String> keyType;

    public Output<String> getKeyType() {
        return this.keyType == null ? Output.empty() : this.keyType;
    }

    /**
     * Identifies what kind of resource this is
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    public ManagedZoneDnssecConfigDefaultKeySpecGetArgs(
        @Nullable Output<String> algorithm,
        @Nullable Output<Integer> keyLength,
        @Nullable Output<String> keyType,
        @Nullable Output<String> kind) {
        this.algorithm = algorithm;
        this.keyLength = keyLength;
        this.keyType = keyType;
        this.kind = kind;
    }

    private ManagedZoneDnssecConfigDefaultKeySpecGetArgs() {
        this.algorithm = Output.empty();
        this.keyLength = Output.empty();
        this.keyType = Output.empty();
        this.kind = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZoneDnssecConfigDefaultKeySpecGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> algorithm;
        private @Nullable Output<Integer> keyLength;
        private @Nullable Output<String> keyType;
        private @Nullable Output<String> kind;

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

        public Builder algorithm(@Nullable Output<String> algorithm) {
            this.algorithm = algorithm;
            return this;
        }

        public Builder algorithm(@Nullable String algorithm) {
            this.algorithm = Output.ofNullable(algorithm);
            return this;
        }

        public Builder keyLength(@Nullable Output<Integer> keyLength) {
            this.keyLength = keyLength;
            return this;
        }

        public Builder keyLength(@Nullable Integer keyLength) {
            this.keyLength = Output.ofNullable(keyLength);
            return this;
        }

        public Builder keyType(@Nullable Output<String> keyType) {
            this.keyType = keyType;
            return this;
        }

        public Builder keyType(@Nullable String keyType) {
            this.keyType = Output.ofNullable(keyType);
            return this;
        }

        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = Output.ofNullable(kind);
            return this;
        }
        public ManagedZoneDnssecConfigDefaultKeySpecGetArgs build() {
            return new ManagedZoneDnssecConfigDefaultKeySpecGetArgs(algorithm, keyLength, keyType, kind);
        }
    }
}
