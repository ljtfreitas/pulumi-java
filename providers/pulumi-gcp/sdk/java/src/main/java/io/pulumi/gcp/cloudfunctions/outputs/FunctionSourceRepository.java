// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudfunctions.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FunctionSourceRepository {
    private final @Nullable String deployedUrl;
    /**
     * The URL pointing to the hosted repository where the function is defined. There are supported Cloud Source Repository URLs in the following formats:
     * 
     */
    private final String url;

    @OutputCustomType.Constructor({"deployedUrl","url"})
    private FunctionSourceRepository(
        @Nullable String deployedUrl,
        String url) {
        this.deployedUrl = deployedUrl;
        this.url = Objects.requireNonNull(url);
    }

    public Optional<String> getDeployedUrl() {
        return Optional.ofNullable(this.deployedUrl);
    }
    /**
     * The URL pointing to the hosted repository where the function is defined. There are supported Cloud Source Repository URLs in the following formats:
     * 
     */
    public String getUrl() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionSourceRepository defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String deployedUrl;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionSourceRepository defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deployedUrl = defaults.deployedUrl;
    	      this.url = defaults.url;
        }

        public Builder setDeployedUrl(@Nullable String deployedUrl) {
            this.deployedUrl = deployedUrl;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public FunctionSourceRepository build() {
            return new FunctionSourceRepository(deployedUrl, url);
        }
    }
}
