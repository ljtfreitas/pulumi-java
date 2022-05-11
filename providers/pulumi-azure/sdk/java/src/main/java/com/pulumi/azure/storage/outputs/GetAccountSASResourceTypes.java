// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetAccountSASResourceTypes {
    /**
     * @return Should permission be granted to the container?
     * 
     */
    private final Boolean container;
    /**
     * @return Should permission be granted only to a specific object?
     * 
     */
    private final Boolean object;
    /**
     * @return Should permission be granted to the entire service?
     * 
     */
    private final Boolean service;

    @CustomType.Constructor
    private GetAccountSASResourceTypes(
        @CustomType.Parameter("container") Boolean container,
        @CustomType.Parameter("object") Boolean object,
        @CustomType.Parameter("service") Boolean service) {
        this.container = container;
        this.object = object;
        this.service = service;
    }

    /**
     * @return Should permission be granted to the container?
     * 
     */
    public Boolean container() {
        return this.container;
    }
    /**
     * @return Should permission be granted only to a specific object?
     * 
     */
    public Boolean object() {
        return this.object;
    }
    /**
     * @return Should permission be granted to the entire service?
     * 
     */
    public Boolean service() {
        return this.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountSASResourceTypes defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean container;
        private Boolean object;
        private Boolean service;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccountSASResourceTypes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.container = defaults.container;
    	      this.object = defaults.object;
    	      this.service = defaults.service;
        }

        public Builder container(Boolean container) {
            this.container = Objects.requireNonNull(container);
            return this;
        }
        public Builder object(Boolean object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }
        public Builder service(Boolean service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }        public GetAccountSASResourceTypes build() {
            return new GetAccountSASResourceTypes(container, object, service);
        }
    }
}
