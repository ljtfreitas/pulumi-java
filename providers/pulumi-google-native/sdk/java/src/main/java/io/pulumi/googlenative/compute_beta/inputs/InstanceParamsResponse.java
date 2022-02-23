// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Additional instance params.
 * 
 */
public final class InstanceParamsResponse extends io.pulumi.resources.InvokeArgs {

    public static final InstanceParamsResponse Empty = new InstanceParamsResponse();

    /**
     * Resource manager tags to be bound to the instance. Tag keys and values have the same definition as resource manager tags. Keys must be in the format `tagKeys/{tag_key_id}`, and values are in the format `tagValues/456`. The field is ignored (both PUT & PATCH) when empty.
     * 
     */
    @InputImport(name="resourceManagerTags", required=true)
      private final Map<String,String> resourceManagerTags;

    public Map<String,String> getResourceManagerTags() {
        return this.resourceManagerTags;
    }

    public InstanceParamsResponse(Map<String,String> resourceManagerTags) {
        this.resourceManagerTags = Objects.requireNonNull(resourceManagerTags, "expected parameter 'resourceManagerTags' to be non-null");
    }

    private InstanceParamsResponse() {
        this.resourceManagerTags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceParamsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> resourceManagerTags;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceParamsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceManagerTags = defaults.resourceManagerTags;
        }

        public Builder setResourceManagerTags(Map<String,String> resourceManagerTags) {
            this.resourceManagerTags = Objects.requireNonNull(resourceManagerTags);
            return this;
        }
        public InstanceParamsResponse build() {
            return new InstanceParamsResponse(resourceManagerTags);
        }
    }
}
