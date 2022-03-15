// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.transfer.outputs;

import io.pulumi.awsnative.transfer.enums.WorkflowStepCopyStepDetailsPropertiesOverwriteExisting;
import io.pulumi.awsnative.transfer.outputs.WorkflowInputFileLocation;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkflowStepCopyStepDetailsProperties {
    private final @Nullable WorkflowInputFileLocation destinationFileLocation;
    /**
     * The name of the step, used as an identifier.
     * 
     */
    private final @Nullable String name;
    /**
     * A flag that indicates whether or not to overwrite an existing file of the same name. The default is FALSE.
     * 
     */
    private final @Nullable WorkflowStepCopyStepDetailsPropertiesOverwriteExisting overwriteExisting;

    @CustomType.Constructor
    private WorkflowStepCopyStepDetailsProperties(
        @CustomType.Parameter("destinationFileLocation") @Nullable WorkflowInputFileLocation destinationFileLocation,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("overwriteExisting") @Nullable WorkflowStepCopyStepDetailsPropertiesOverwriteExisting overwriteExisting) {
        this.destinationFileLocation = destinationFileLocation;
        this.name = name;
        this.overwriteExisting = overwriteExisting;
    }

    public Optional<WorkflowInputFileLocation> getDestinationFileLocation() {
        return Optional.ofNullable(this.destinationFileLocation);
    }
    /**
     * The name of the step, used as an identifier.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * A flag that indicates whether or not to overwrite an existing file of the same name. The default is FALSE.
     * 
    */
    public Optional<WorkflowStepCopyStepDetailsPropertiesOverwriteExisting> getOverwriteExisting() {
        return Optional.ofNullable(this.overwriteExisting);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowStepCopyStepDetailsProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WorkflowInputFileLocation destinationFileLocation;
        private @Nullable String name;
        private @Nullable WorkflowStepCopyStepDetailsPropertiesOverwriteExisting overwriteExisting;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowStepCopyStepDetailsProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationFileLocation = defaults.destinationFileLocation;
    	      this.name = defaults.name;
    	      this.overwriteExisting = defaults.overwriteExisting;
        }

        public Builder destinationFileLocation(@Nullable WorkflowInputFileLocation destinationFileLocation) {
            this.destinationFileLocation = destinationFileLocation;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder overwriteExisting(@Nullable WorkflowStepCopyStepDetailsPropertiesOverwriteExisting overwriteExisting) {
            this.overwriteExisting = overwriteExisting;
            return this;
        }
        public WorkflowStepCopyStepDetailsProperties build() {
            return new WorkflowStepCopyStepDetailsProperties(destinationFileLocation, name, overwriteExisting);
        }
    }
}
