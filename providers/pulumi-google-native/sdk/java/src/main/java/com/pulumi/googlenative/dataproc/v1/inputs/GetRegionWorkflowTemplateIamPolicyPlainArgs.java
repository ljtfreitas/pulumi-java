// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc.v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionWorkflowTemplateIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionWorkflowTemplateIamPolicyPlainArgs Empty = new GetRegionWorkflowTemplateIamPolicyPlainArgs();

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="regionId", required=true)
    private String regionId;

    public String regionId() {
        return this.regionId;
    }

    @Import(name="workflowTemplateId", required=true)
    private String workflowTemplateId;

    public String workflowTemplateId() {
        return this.workflowTemplateId;
    }

    private GetRegionWorkflowTemplateIamPolicyPlainArgs() {}

    private GetRegionWorkflowTemplateIamPolicyPlainArgs(GetRegionWorkflowTemplateIamPolicyPlainArgs $) {
        this.project = $.project;
        this.regionId = $.regionId;
        this.workflowTemplateId = $.workflowTemplateId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionWorkflowTemplateIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionWorkflowTemplateIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetRegionWorkflowTemplateIamPolicyPlainArgs();
        }

        public Builder(GetRegionWorkflowTemplateIamPolicyPlainArgs defaults) {
            $ = new GetRegionWorkflowTemplateIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder regionId(String regionId) {
            $.regionId = regionId;
            return this;
        }

        public Builder workflowTemplateId(String workflowTemplateId) {
            $.workflowTemplateId = workflowTemplateId;
            return this;
        }

        public GetRegionWorkflowTemplateIamPolicyPlainArgs build() {
            $.regionId = Objects.requireNonNull($.regionId, "expected parameter 'regionId' to be non-null");
            $.workflowTemplateId = Objects.requireNonNull($.workflowTemplateId, "expected parameter 'workflowTemplateId' to be non-null");
            return $;
        }
    }

}
