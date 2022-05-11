// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetIotHubResult {
    /**
     * @return The Hostname of the IoTHub.
     * 
     */
    private final String hostname;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    private final String resourceGroupName;
    private final @Nullable Map<String,String> tags;

    @CustomType.Constructor
    private GetIotHubResult(
        @CustomType.Parameter("hostname") String hostname,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags) {
        this.hostname = hostname;
        this.id = id;
        this.name = name;
        this.resourceGroupName = resourceGroupName;
        this.tags = tags;
    }

    /**
     * @return The Hostname of the IoTHub.
     * 
     */
    public String hostname() {
        return this.hostname;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIotHubResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hostname;
        private String id;
        private String name;
        private String resourceGroupName;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIotHubResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder hostname(String hostname) {
            this.hostname = Objects.requireNonNull(hostname);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }        public GetIotHubResult build() {
            return new GetIotHubResult(hostname, id, name, resourceGroupName, tags);
        }
    }
}
