// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainNameMutualTlsAuthenticationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainNameMutualTlsAuthenticationArgs Empty = new DomainNameMutualTlsAuthenticationArgs();

    @Import(name="truststoreUri")
      private final @Nullable Output<String> truststoreUri;

    public Output<String> getTruststoreUri() {
        return this.truststoreUri == null ? Output.empty() : this.truststoreUri;
    }

    @Import(name="truststoreVersion")
      private final @Nullable Output<String> truststoreVersion;

    public Output<String> getTruststoreVersion() {
        return this.truststoreVersion == null ? Output.empty() : this.truststoreVersion;
    }

    public DomainNameMutualTlsAuthenticationArgs(
        @Nullable Output<String> truststoreUri,
        @Nullable Output<String> truststoreVersion) {
        this.truststoreUri = truststoreUri;
        this.truststoreVersion = truststoreVersion;
    }

    private DomainNameMutualTlsAuthenticationArgs() {
        this.truststoreUri = Output.empty();
        this.truststoreVersion = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainNameMutualTlsAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> truststoreUri;
        private @Nullable Output<String> truststoreVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainNameMutualTlsAuthenticationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.truststoreUri = defaults.truststoreUri;
    	      this.truststoreVersion = defaults.truststoreVersion;
        }

        public Builder truststoreUri(@Nullable Output<String> truststoreUri) {
            this.truststoreUri = truststoreUri;
            return this;
        }

        public Builder truststoreUri(@Nullable String truststoreUri) {
            this.truststoreUri = Output.ofNullable(truststoreUri);
            return this;
        }

        public Builder truststoreVersion(@Nullable Output<String> truststoreVersion) {
            this.truststoreVersion = truststoreVersion;
            return this;
        }

        public Builder truststoreVersion(@Nullable String truststoreVersion) {
            this.truststoreVersion = Output.ofNullable(truststoreVersion);
            return this;
        }
        public DomainNameMutualTlsAuthenticationArgs build() {
            return new DomainNameMutualTlsAuthenticationArgs(truststoreUri, truststoreVersion);
        }
    }
}
