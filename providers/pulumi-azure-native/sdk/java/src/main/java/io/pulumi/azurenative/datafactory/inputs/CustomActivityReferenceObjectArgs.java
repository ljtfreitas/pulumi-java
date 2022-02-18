// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.DatasetReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Reference objects for custom activity
 * 
 */
public final class CustomActivityReferenceObjectArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomActivityReferenceObjectArgs Empty = new CustomActivityReferenceObjectArgs();

    /**
     * Dataset references.
     * 
     */
    @InputImport(name="datasets")
    private final @Nullable Input<List<DatasetReferenceArgs>> datasets;

    public Input<List<DatasetReferenceArgs>> getDatasets() {
        return this.datasets == null ? Input.empty() : this.datasets;
    }

    /**
     * Linked service references.
     * 
     */
    @InputImport(name="linkedServices")
    private final @Nullable Input<List<LinkedServiceReferenceArgs>> linkedServices;

    public Input<List<LinkedServiceReferenceArgs>> getLinkedServices() {
        return this.linkedServices == null ? Input.empty() : this.linkedServices;
    }

    public CustomActivityReferenceObjectArgs(
        @Nullable Input<List<DatasetReferenceArgs>> datasets,
        @Nullable Input<List<LinkedServiceReferenceArgs>> linkedServices) {
        this.datasets = datasets;
        this.linkedServices = linkedServices;
    }

    private CustomActivityReferenceObjectArgs() {
        this.datasets = Input.empty();
        this.linkedServices = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomActivityReferenceObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<DatasetReferenceArgs>> datasets;
        private @Nullable Input<List<LinkedServiceReferenceArgs>> linkedServices;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomActivityReferenceObjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasets = defaults.datasets;
    	      this.linkedServices = defaults.linkedServices;
        }

        public Builder setDatasets(@Nullable Input<List<DatasetReferenceArgs>> datasets) {
            this.datasets = datasets;
            return this;
        }

        public Builder setDatasets(@Nullable List<DatasetReferenceArgs> datasets) {
            this.datasets = Input.ofNullable(datasets);
            return this;
        }

        public Builder setLinkedServices(@Nullable Input<List<LinkedServiceReferenceArgs>> linkedServices) {
            this.linkedServices = linkedServices;
            return this;
        }

        public Builder setLinkedServices(@Nullable List<LinkedServiceReferenceArgs> linkedServices) {
            this.linkedServices = Input.ofNullable(linkedServices);
            return this;
        }

        public CustomActivityReferenceObjectArgs build() {
            return new CustomActivityReferenceObjectArgs(datasets, linkedServices);
        }
    }
}
