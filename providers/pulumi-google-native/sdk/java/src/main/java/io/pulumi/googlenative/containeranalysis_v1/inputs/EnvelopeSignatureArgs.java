// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvelopeSignatureArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvelopeSignatureArgs Empty = new EnvelopeSignatureArgs();

    @Import(name="keyid")
      private final @Nullable Output<String> keyid;

    public Output<String> getKeyid() {
        return this.keyid == null ? Output.empty() : this.keyid;
    }

    @Import(name="sig")
      private final @Nullable Output<String> sig;

    public Output<String> getSig() {
        return this.sig == null ? Output.empty() : this.sig;
    }

    public EnvelopeSignatureArgs(
        @Nullable Output<String> keyid,
        @Nullable Output<String> sig) {
        this.keyid = keyid;
        this.sig = sig;
    }

    private EnvelopeSignatureArgs() {
        this.keyid = Output.empty();
        this.sig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvelopeSignatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> keyid;
        private @Nullable Output<String> sig;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvelopeSignatureArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyid = defaults.keyid;
    	      this.sig = defaults.sig;
        }

        public Builder keyid(@Nullable Output<String> keyid) {
            this.keyid = keyid;
            return this;
        }

        public Builder keyid(@Nullable String keyid) {
            this.keyid = Output.ofNullable(keyid);
            return this;
        }

        public Builder sig(@Nullable Output<String> sig) {
            this.sig = sig;
            return this;
        }

        public Builder sig(@Nullable String sig) {
            this.sig = Output.ofNullable(sig);
            return this;
        }
        public EnvelopeSignatureArgs build() {
            return new EnvelopeSignatureArgs(keyid, sig);
        }
    }
}
