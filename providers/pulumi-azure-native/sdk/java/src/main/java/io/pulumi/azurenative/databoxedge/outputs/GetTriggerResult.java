// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.azurenative.databoxedge.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetTriggerResult {
    /**
     * The path ID that uniquely identifies the object.
     * 
     */
    private final String id;
    /**
     * Trigger Kind.
     * 
     */
    private final String kind;
    /**
     * The object name.
     * 
     */
    private final String name;
    /**
     * Trigger in DataBoxEdge Resource
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The hierarchical type of the object.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","kind","name","systemData","type"})
    private GetTriggerResult(
        String id,
        String kind,
        String name,
        SystemDataResponse systemData,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The path ID that uniquely identifies the object.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Trigger Kind.
     * 
     */
    public String getKind() {
        return this.kind;
    }
    /**
     * The object name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Trigger in DataBoxEdge Resource
     * 
     */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The hierarchical type of the object.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTriggerResult defaults) {
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

        public Builder(GetTriggerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetTriggerResult build() {
            return new GetTriggerResult(id, kind, name, systemData, type);
        }
    }
}
