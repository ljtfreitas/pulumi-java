// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration settings of the paths HTTP requests.
 * 
 */
public final class HttpSettingsRoutesArgs extends io.pulumi.resources.ResourceArgs {

    public static final HttpSettingsRoutesArgs Empty = new HttpSettingsRoutesArgs();

    /**
     * The prefix that should precede all the authentication/authorization paths.
     * 
     */
    @InputImport(name="apiPrefix")
        private final @Nullable Input<String> apiPrefix;

    public Input<String> getApiPrefix() {
        return this.apiPrefix == null ? Input.empty() : this.apiPrefix;
    }

    public HttpSettingsRoutesArgs(@Nullable Input<String> apiPrefix) {
        this.apiPrefix = apiPrefix;
    }

    private HttpSettingsRoutesArgs() {
        this.apiPrefix = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpSettingsRoutesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpSettingsRoutesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiPrefix = defaults.apiPrefix;
        }

        public Builder setApiPrefix(@Nullable Input<String> apiPrefix) {
            this.apiPrefix = apiPrefix;
            return this;
        }

        public Builder setApiPrefix(@Nullable String apiPrefix) {
            this.apiPrefix = Input.ofNullable(apiPrefix);
            return this;
        }
        public HttpSettingsRoutesArgs build() {
            return new HttpSettingsRoutesArgs(apiPrefix);
        }
    }
}
