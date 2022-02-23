// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A signature object consists of the KeyID used and the signature itself.
 * 
 */
public final class GrafeasV1beta1IntotoSignatureArgs extends io.pulumi.resources.ResourceArgs {

    public static final GrafeasV1beta1IntotoSignatureArgs Empty = new GrafeasV1beta1IntotoSignatureArgs();

    @InputImport(name="keyid")
      private final @Nullable Input<String> keyid;

    public Input<String> getKeyid() {
        return this.keyid == null ? Input.empty() : this.keyid;
    }

    @InputImport(name="sig")
      private final @Nullable Input<String> sig;

    public Input<String> getSig() {
        return this.sig == null ? Input.empty() : this.sig;
    }

    public GrafeasV1beta1IntotoSignatureArgs(
        @Nullable Input<String> keyid,
        @Nullable Input<String> sig) {
        this.keyid = keyid;
        this.sig = sig;
    }

    private GrafeasV1beta1IntotoSignatureArgs() {
        this.keyid = Input.empty();
        this.sig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrafeasV1beta1IntotoSignatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> keyid;
        private @Nullable Input<String> sig;

        public Builder() {
    	      // Empty
        }

        public Builder(GrafeasV1beta1IntotoSignatureArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyid = defaults.keyid;
    	      this.sig = defaults.sig;
        }

        public Builder setKeyid(@Nullable Input<String> keyid) {
            this.keyid = keyid;
            return this;
        }

        public Builder setKeyid(@Nullable String keyid) {
            this.keyid = Input.ofNullable(keyid);
            return this;
        }

        public Builder setSig(@Nullable Input<String> sig) {
            this.sig = sig;
            return this;
        }

        public Builder setSig(@Nullable String sig) {
            this.sig = Input.ofNullable(sig);
            return this;
        }
        public GrafeasV1beta1IntotoSignatureArgs build() {
            return new GrafeasV1beta1IntotoSignatureArgs(keyid, sig);
        }
    }
}
