// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationsmanagement.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Solution properties supported by the OperationsManagement resource provider.
 * 
 */
public final class SolutionPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final SolutionPropertiesArgs Empty = new SolutionPropertiesArgs();

    /**
     * The azure resources that will be contained within the solutions. They will be locked and gets deleted automatically when the solution is deleted.
     * 
     */
    @InputImport(name="containedResources")
    private final @Nullable Input<List<String>> containedResources;

    public Input<List<String>> getContainedResources() {
        return this.containedResources == null ? Input.empty() : this.containedResources;
    }

    /**
     * The resources that will be referenced from this solution. Deleting any of those solution out of band will break the solution.
     * 
     */
    @InputImport(name="referencedResources")
    private final @Nullable Input<List<String>> referencedResources;

    public Input<List<String>> getReferencedResources() {
        return this.referencedResources == null ? Input.empty() : this.referencedResources;
    }

    /**
     * The azure resourceId for the workspace where the solution will be deployed/enabled.
     * 
     */
    @InputImport(name="workspaceResourceId", required=true)
    private final Input<String> workspaceResourceId;

    public Input<String> getWorkspaceResourceId() {
        return this.workspaceResourceId;
    }

    public SolutionPropertiesArgs(
        @Nullable Input<List<String>> containedResources,
        @Nullable Input<List<String>> referencedResources,
        Input<String> workspaceResourceId) {
        this.containedResources = containedResources;
        this.referencedResources = referencedResources;
        this.workspaceResourceId = Objects.requireNonNull(workspaceResourceId, "expected parameter 'workspaceResourceId' to be non-null");
    }

    private SolutionPropertiesArgs() {
        this.containedResources = Input.empty();
        this.referencedResources = Input.empty();
        this.workspaceResourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SolutionPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> containedResources;
        private @Nullable Input<List<String>> referencedResources;
        private Input<String> workspaceResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(SolutionPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containedResources = defaults.containedResources;
    	      this.referencedResources = defaults.referencedResources;
    	      this.workspaceResourceId = defaults.workspaceResourceId;
        }

        public Builder setContainedResources(@Nullable Input<List<String>> containedResources) {
            this.containedResources = containedResources;
            return this;
        }

        public Builder setContainedResources(@Nullable List<String> containedResources) {
            this.containedResources = Input.ofNullable(containedResources);
            return this;
        }

        public Builder setReferencedResources(@Nullable Input<List<String>> referencedResources) {
            this.referencedResources = referencedResources;
            return this;
        }

        public Builder setReferencedResources(@Nullable List<String> referencedResources) {
            this.referencedResources = Input.ofNullable(referencedResources);
            return this;
        }

        public Builder setWorkspaceResourceId(Input<String> workspaceResourceId) {
            this.workspaceResourceId = Objects.requireNonNull(workspaceResourceId);
            return this;
        }

        public Builder setWorkspaceResourceId(String workspaceResourceId) {
            this.workspaceResourceId = Input.of(Objects.requireNonNull(workspaceResourceId));
            return this;
        }

        public SolutionPropertiesArgs build() {
            return new SolutionPropertiesArgs(containedResources, referencedResources, workspaceResourceId);
        }
    }
}
