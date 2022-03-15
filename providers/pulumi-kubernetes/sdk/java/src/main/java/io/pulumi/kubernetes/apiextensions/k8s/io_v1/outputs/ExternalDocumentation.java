// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiextensions.k8s.io_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExternalDocumentation {
    private final @Nullable String description;
    private final @Nullable String url;

    @CustomType.Constructor
    private ExternalDocumentation(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("url") @Nullable String url) {
        this.description = description;
        this.url = url;
    }

    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> getUrl() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalDocumentation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable String url;

        public Builder() {
    	      // Empty
        }

        public Builder(ExternalDocumentation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.url = defaults.url;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder url(@Nullable String url) {
            this.url = url;
            return this;
        }
        public ExternalDocumentation build() {
            return new ExternalDocumentation(description, url);
        }
    }
}
