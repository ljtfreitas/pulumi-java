// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.kms.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KeyRingImportJobPublicKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyRingImportJobPublicKeyArgs Empty = new KeyRingImportJobPublicKeyArgs();

    @Import(name="pem")
      private final @Nullable Output<String> pem;

    public Output<String> pem() {
        return this.pem == null ? Codegen.empty() : this.pem;
    }

    public KeyRingImportJobPublicKeyArgs(@Nullable Output<String> pem) {
        this.pem = pem;
    }

    private KeyRingImportJobPublicKeyArgs() {
        this.pem = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyRingImportJobPublicKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> pem;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyRingImportJobPublicKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pem = defaults.pem;
        }

        public Builder pem(@Nullable Output<String> pem) {
            this.pem = pem;
            return this;
        }
        public Builder pem(@Nullable String pem) {
            this.pem = Codegen.ofNullable(pem);
            return this;
        }        public KeyRingImportJobPublicKeyArgs build() {
            return new KeyRingImportJobPublicKeyArgs(pem);
        }
    }
}
