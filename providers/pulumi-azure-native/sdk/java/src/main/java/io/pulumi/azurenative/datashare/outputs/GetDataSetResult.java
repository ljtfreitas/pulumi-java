// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.outputs;

import io.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDataSetResult {
    /**
     * The resource id of the azure resource
     * 
     */
    private final String id;
    /**
     * Kind of data set.
     * 
     */
    private final String kind;
    /**
     * Name of the azure resource
     * 
     */
    private final String name;
    /**
     * System Data of the Azure resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Type of the azure resource
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetDataSetResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.kind = kind;
        this.name = name;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * The resource id of the azure resource
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Kind of data set.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Name of the azure resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * System Data of the Azure resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Type of the azure resource
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataSetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String kind;
        private String name;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataSetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetDataSetResult build() {
            return new GetDataSetResult(id, kind, name, systemData, type);
        }
    }
}
