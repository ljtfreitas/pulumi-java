// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.connectors_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Secret provides a reference to entries in Secret Manager.
 * 
 */
public final class SecretArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecretArgs Empty = new SecretArgs();

    /**
     * The resource name of the secret version in the format, format as: `projects/*{@literal /}secrets/*{@literal /}versions/*`.
     * 
     */
    @Import(name="secretVersion")
      private final @Nullable Output<String> secretVersion;

    public Output<String> getSecretVersion() {
        return this.secretVersion == null ? Output.empty() : this.secretVersion;
    }

    public SecretArgs(@Nullable Output<String> secretVersion) {
        this.secretVersion = secretVersion;
    }

    private SecretArgs() {
        this.secretVersion = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> secretVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretVersion = defaults.secretVersion;
        }

        public Builder secretVersion(@Nullable Output<String> secretVersion) {
            this.secretVersion = secretVersion;
            return this;
        }

        public Builder secretVersion(@Nullable String secretVersion) {
            this.secretVersion = Output.ofNullable(secretVersion);
            return this;
        }
        public SecretArgs build() {
            return new SecretArgs(secretVersion);
        }
    }
}
