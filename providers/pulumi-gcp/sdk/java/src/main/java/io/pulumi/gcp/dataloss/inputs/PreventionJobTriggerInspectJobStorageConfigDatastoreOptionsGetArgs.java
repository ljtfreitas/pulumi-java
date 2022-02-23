// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsKindGetArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionIdGetArgs;
import java.util.Objects;


public final class PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsGetArgs Empty = new PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsGetArgs();

    /**
     * A representation of a Datastore kind.
     * Structure is documented below.
     * 
     */
    @InputImport(name="kind", required=true)
        private final Input<PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsKindGetArgs> kind;

    public Input<PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsKindGetArgs> getKind() {
        return this.kind;
    }

    /**
     * Datastore partition ID. A partition ID identifies a grouping of entities. The grouping
     * is always by project and namespace, however the namespace ID may be empty.
     * Structure is documented below.
     * 
     */
    @InputImport(name="partitionId", required=true)
        private final Input<PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionIdGetArgs> partitionId;

    public Input<PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionIdGetArgs> getPartitionId() {
        return this.partitionId;
    }

    public PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsGetArgs(
        Input<PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsKindGetArgs> kind,
        Input<PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionIdGetArgs> partitionId) {
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.partitionId = Objects.requireNonNull(partitionId, "expected parameter 'partitionId' to be non-null");
    }

    private PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsGetArgs() {
        this.kind = Input.empty();
        this.partitionId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsKindGetArgs> kind;
        private Input<PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionIdGetArgs> partitionId;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.partitionId = defaults.partitionId;
        }

        public Builder setKind(Input<PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsKindGetArgs> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsKindGetArgs kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder setPartitionId(Input<PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionIdGetArgs> partitionId) {
            this.partitionId = Objects.requireNonNull(partitionId);
            return this;
        }

        public Builder setPartitionId(PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionIdGetArgs partitionId) {
            this.partitionId = Input.of(Objects.requireNonNull(partitionId));
            return this;
        }
        public PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsGetArgs build() {
            return new PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsGetArgs(kind, partitionId);
        }
    }
}
