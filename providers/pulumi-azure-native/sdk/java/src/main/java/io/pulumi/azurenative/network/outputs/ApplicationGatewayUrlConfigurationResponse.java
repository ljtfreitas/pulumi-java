// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationGatewayUrlConfigurationResponse {
    /**
     * Url path which user has provided for url rewrite. Null means no path will be updated. Default value is null.
     * 
     */
    private final @Nullable String modifiedPath;
    /**
     * Query string which user has provided for url rewrite. Null means no query string will be updated. Default value is null.
     * 
     */
    private final @Nullable String modifiedQueryString;
    /**
     * If set as true, it will re-evaluate the url path map provided in path based request routing rules using modified path. Default value is false.
     * 
     */
    private final @Nullable Boolean reroute;

    @OutputCustomType.Constructor({"modifiedPath","modifiedQueryString","reroute"})
    private ApplicationGatewayUrlConfigurationResponse(
        @Nullable String modifiedPath,
        @Nullable String modifiedQueryString,
        @Nullable Boolean reroute) {
        this.modifiedPath = modifiedPath;
        this.modifiedQueryString = modifiedQueryString;
        this.reroute = reroute;
    }

    /**
     * Url path which user has provided for url rewrite. Null means no path will be updated. Default value is null.
     * 
     */
    public Optional<String> getModifiedPath() {
        return Optional.ofNullable(this.modifiedPath);
    }
    /**
     * Query string which user has provided for url rewrite. Null means no query string will be updated. Default value is null.
     * 
     */
    public Optional<String> getModifiedQueryString() {
        return Optional.ofNullable(this.modifiedQueryString);
    }
    /**
     * If set as true, it will re-evaluate the url path map provided in path based request routing rules using modified path. Default value is false.
     * 
     */
    public Optional<Boolean> getReroute() {
        return Optional.ofNullable(this.reroute);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayUrlConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String modifiedPath;
        private @Nullable String modifiedQueryString;
        private @Nullable Boolean reroute;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayUrlConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.modifiedPath = defaults.modifiedPath;
    	      this.modifiedQueryString = defaults.modifiedQueryString;
    	      this.reroute = defaults.reroute;
        }

        public Builder setModifiedPath(@Nullable String modifiedPath) {
            this.modifiedPath = modifiedPath;
            return this;
        }

        public Builder setModifiedQueryString(@Nullable String modifiedQueryString) {
            this.modifiedQueryString = modifiedQueryString;
            return this;
        }

        public Builder setReroute(@Nullable Boolean reroute) {
            this.reroute = reroute;
            return this;
        }

        public ApplicationGatewayUrlConfigurationResponse build() {
            return new ApplicationGatewayUrlConfigurationResponse(modifiedPath, modifiedQueryString, reroute);
        }
    }
}
