// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.apigee_v1.enums.DataCollectorType;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataCollectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataCollectorArgs Empty = new DataCollectorArgs();

    @InputImport(name="dataCollectorId")
      private final @Nullable Input<String> dataCollectorId;

    public Input<String> getDataCollectorId() {
        return this.dataCollectorId == null ? Input.empty() : this.dataCollectorId;
    }

    /**
     * A description of the data collector.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * ID of the data collector. Must begin with `dc_`.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="organizationId", required=true)
      private final Input<String> organizationId;

    public Input<String> getOrganizationId() {
        return this.organizationId;
    }

    /**
     * Immutable. The type of data this data collector will collect.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<DataCollectorType> type;

    public Input<DataCollectorType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public DataCollectorArgs(
        @Nullable Input<String> dataCollectorId,
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        Input<String> organizationId,
        @Nullable Input<DataCollectorType> type) {
        this.dataCollectorId = dataCollectorId;
        this.description = description;
        this.name = name;
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
        this.type = type;
    }

    private DataCollectorArgs() {
        this.dataCollectorId = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.organizationId = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataCollectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> dataCollectorId;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private Input<String> organizationId;
        private @Nullable Input<DataCollectorType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DataCollectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataCollectorId = defaults.dataCollectorId;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.organizationId = defaults.organizationId;
    	      this.type = defaults.type;
        }

        public Builder setDataCollectorId(@Nullable Input<String> dataCollectorId) {
            this.dataCollectorId = dataCollectorId;
            return this;
        }

        public Builder setDataCollectorId(@Nullable String dataCollectorId) {
            this.dataCollectorId = Input.ofNullable(dataCollectorId);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setOrganizationId(Input<String> organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }

        public Builder setOrganizationId(String organizationId) {
            this.organizationId = Input.of(Objects.requireNonNull(organizationId));
            return this;
        }

        public Builder setType(@Nullable Input<DataCollectorType> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable DataCollectorType type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public DataCollectorArgs build() {
            return new DataCollectorArgs(dataCollectorId, description, name, organizationId, type);
        }
    }
}
