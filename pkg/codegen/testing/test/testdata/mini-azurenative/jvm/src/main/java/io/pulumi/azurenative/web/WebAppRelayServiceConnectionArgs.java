// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAppRelayServiceConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAppRelayServiceConnectionArgs Empty = new WebAppRelayServiceConnectionArgs();

    @InputImport(name="resourceType")
      private final @Nullable Input<String> resourceType;

    public Input<String> getPropResourceType() {
        return this.resourceType == null ? Input.empty() : this.resourceType;
    }

    public WebAppRelayServiceConnectionArgs(@Nullable Input<String> resourceType) {
        this.resourceType = resourceType;
    }

    private WebAppRelayServiceConnectionArgs() {
        this.resourceType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAppRelayServiceConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAppRelayServiceConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceType = defaults.resourceType;
        }

        public Builder setResourceType(@Nullable Input<String> resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public Builder setResourceType(@Nullable String resourceType) {
            this.resourceType = Input.ofNullable(resourceType);
            return this;
        }
        public WebAppRelayServiceConnectionArgs build() {
            return new WebAppRelayServiceConnectionArgs(resourceType);
        }
    }
}
