// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Information about the formal API definition for the app.
 * 
 */
public final class ApiDefinitionInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiDefinitionInfoArgs Empty = new ApiDefinitionInfoArgs();

    /**
     * The URL of the API definition.
     * 
     */
    @InputImport(name="url")
    private final @Nullable Input<String> url;

    public Input<String> getUrl() {
        return this.url == null ? Input.empty() : this.url;
    }

    public ApiDefinitionInfoArgs(@Nullable Input<String> url) {
        this.url = url;
    }

    private ApiDefinitionInfoArgs() {
        this.url = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiDefinitionInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiDefinitionInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.url = defaults.url;
        }

        public Builder setUrl(@Nullable Input<String> url) {
            this.url = url;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = Input.ofNullable(url);
            return this;
        }

        public ApiDefinitionInfoArgs build() {
            return new ApiDefinitionInfoArgs(url);
        }
    }
}
