// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListManagedClusterAccessProfileResult {
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * Base64-encoded Kubernetes configuration file.
     * 
     */
    private final @Nullable String kubeConfig;
    /**
     * Resource location
     * 
     */
    private final String location;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ListManagedClusterAccessProfileResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kubeConfig") @Nullable String kubeConfig,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.kubeConfig = kubeConfig;
        this.location = location;
        this.name = name;
        this.tags = tags;
        this.type = type;
    }

    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Base64-encoded Kubernetes configuration file.
     * 
    */
    public Optional<String> getKubeConfig() {
        return Optional.ofNullable(this.kubeConfig);
    }
    /**
     * Resource location
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Resource tags
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListManagedClusterAccessProfileResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String kubeConfig;
        private String location;
        private String name;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ListManagedClusterAccessProfileResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.kubeConfig = defaults.kubeConfig;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder kubeConfig(@Nullable String kubeConfig) {
            this.kubeConfig = kubeConfig;
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ListManagedClusterAccessProfileResult build() {
            return new ListManagedClusterAccessProfileResult(id, kubeConfig, location, name, tags, type);
        }
    }
}
