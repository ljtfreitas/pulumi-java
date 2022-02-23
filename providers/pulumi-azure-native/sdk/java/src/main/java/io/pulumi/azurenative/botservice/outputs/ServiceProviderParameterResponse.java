// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.outputs;

import io.pulumi.azurenative.botservice.outputs.ServiceProviderParameterResponseMetadata;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ServiceProviderParameterResponse {
    /**
     * Default Name for the Service Provider
     * 
     */
    private final String $default;
    /**
     * Description of the Service Provider
     * 
     */
    private final String description;
    /**
     * Display Name of the Service Provider
     * 
     */
    private final String displayName;
    /**
     * Help Url for the  Service Provider
     * 
     */
    private final String helpUrl;
    /**
     * Meta data for the Service Provider
     * 
     */
    private final ServiceProviderParameterResponseMetadata metadata;
    /**
     * Name of the Service Provider
     * 
     */
    private final String name;
    /**
     * Type of the Service Provider
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"$default","description","displayName","helpUrl","metadata","name","type"})
    private ServiceProviderParameterResponse(
        String $default,
        String description,
        String displayName,
        String helpUrl,
        ServiceProviderParameterResponseMetadata metadata,
        String name,
        String type) {
        this.$default = Objects.requireNonNull($default);
        this.description = Objects.requireNonNull(description);
        this.displayName = Objects.requireNonNull(displayName);
        this.helpUrl = Objects.requireNonNull(helpUrl);
        this.metadata = Objects.requireNonNull(metadata);
        this.name = Objects.requireNonNull(name);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Default Name for the Service Provider
     * 
     */
    public String get$default() {
        return this.$default;
    }
    /**
     * Description of the Service Provider
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Display Name of the Service Provider
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Help Url for the  Service Provider
     * 
     */
    public String getHelpUrl() {
        return this.helpUrl;
    }
    /**
     * Meta data for the Service Provider
     * 
     */
    public ServiceProviderParameterResponseMetadata getMetadata() {
        return this.metadata;
    }
    /**
     * Name of the Service Provider
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Type of the Service Provider
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceProviderParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String $default;
        private String description;
        private String displayName;
        private String helpUrl;
        private ServiceProviderParameterResponseMetadata metadata;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceProviderParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.$default = defaults.$default;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.helpUrl = defaults.helpUrl;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder set$default(String $default) {
            this.$default = Objects.requireNonNull($default);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setHelpUrl(String helpUrl) {
            this.helpUrl = Objects.requireNonNull(helpUrl);
            return this;
        }

        public Builder setMetadata(ServiceProviderParameterResponseMetadata metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ServiceProviderParameterResponse build() {
            return new ServiceProviderParameterResponse($default, description, displayName, helpUrl, metadata, name, type);
        }
    }
}
