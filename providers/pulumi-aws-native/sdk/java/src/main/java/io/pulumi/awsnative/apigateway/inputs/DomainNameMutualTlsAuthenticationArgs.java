// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainNameMutualTlsAuthenticationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainNameMutualTlsAuthenticationArgs Empty = new DomainNameMutualTlsAuthenticationArgs();

    @InputImport(name="truststoreUri")
        private final @Nullable Input<String> truststoreUri;

    public Input<String> getTruststoreUri() {
        return this.truststoreUri == null ? Input.empty() : this.truststoreUri;
    }

    @InputImport(name="truststoreVersion")
        private final @Nullable Input<String> truststoreVersion;

    public Input<String> getTruststoreVersion() {
        return this.truststoreVersion == null ? Input.empty() : this.truststoreVersion;
    }

    public DomainNameMutualTlsAuthenticationArgs(
        @Nullable Input<String> truststoreUri,
        @Nullable Input<String> truststoreVersion) {
        this.truststoreUri = truststoreUri;
        this.truststoreVersion = truststoreVersion;
    }

    private DomainNameMutualTlsAuthenticationArgs() {
        this.truststoreUri = Input.empty();
        this.truststoreVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainNameMutualTlsAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> truststoreUri;
        private @Nullable Input<String> truststoreVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainNameMutualTlsAuthenticationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.truststoreUri = defaults.truststoreUri;
    	      this.truststoreVersion = defaults.truststoreVersion;
        }

        public Builder setTruststoreUri(@Nullable Input<String> truststoreUri) {
            this.truststoreUri = truststoreUri;
            return this;
        }

        public Builder setTruststoreUri(@Nullable String truststoreUri) {
            this.truststoreUri = Input.ofNullable(truststoreUri);
            return this;
        }

        public Builder setTruststoreVersion(@Nullable Input<String> truststoreVersion) {
            this.truststoreVersion = truststoreVersion;
            return this;
        }

        public Builder setTruststoreVersion(@Nullable String truststoreVersion) {
            this.truststoreVersion = Input.ofNullable(truststoreVersion);
            return this;
        }
        public DomainNameMutualTlsAuthenticationArgs build() {
            return new DomainNameMutualTlsAuthenticationArgs(truststoreUri, truststoreVersion);
        }
    }
}
