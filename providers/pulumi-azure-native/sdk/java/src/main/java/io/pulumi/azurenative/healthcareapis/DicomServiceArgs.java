// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthcareapis;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DicomServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final DicomServiceArgs Empty = new DicomServiceArgs();

    /**
     * The name of DICOM Service resource.
     * 
     */
    @Import(name="dicomServiceName")
      private final @Nullable Output<String> dicomServiceName;

    public Output<String> getDicomServiceName() {
        return this.dicomServiceName == null ? Output.empty() : this.dicomServiceName;
    }

    /**
     * The resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The name of the resource group that contains the service instance.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * The name of workspace resource.
     * 
     */
    @Import(name="workspaceName", required=true)
      private final Output<String> workspaceName;

    public Output<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public DicomServiceArgs(
        @Nullable Output<String> dicomServiceName,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags,
        Output<String> workspaceName) {
        this.dicomServiceName = dicomServiceName;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private DicomServiceArgs() {
        this.dicomServiceName = Output.empty();
        this.location = Output.empty();
        this.resourceGroupName = Output.empty();
        this.tags = Output.empty();
        this.workspaceName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DicomServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> dicomServiceName;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;
        private Output<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(DicomServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dicomServiceName = defaults.dicomServiceName;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder dicomServiceName(@Nullable Output<String> dicomServiceName) {
            this.dicomServiceName = dicomServiceName;
            return this;
        }

        public Builder dicomServiceName(@Nullable String dicomServiceName) {
            this.dicomServiceName = Output.ofNullable(dicomServiceName);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder workspaceName(Output<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Output.of(Objects.requireNonNull(workspaceName));
            return this;
        }
        public DicomServiceArgs build() {
            return new DicomServiceArgs(dicomServiceName, location, resourceGroupName, tags, workspaceName);
        }
    }
}
