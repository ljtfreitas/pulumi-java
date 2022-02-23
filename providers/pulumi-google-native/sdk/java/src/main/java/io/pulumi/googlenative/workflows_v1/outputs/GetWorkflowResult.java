// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.workflows_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetWorkflowResult {
    /**
     * The timestamp of when the workflow was created.
     * 
     */
    private final String createTime;
    /**
     * Description of the workflow provided by the user. Must be at most 1000 unicode characters long.
     * 
     */
    private final String description;
    /**
     * Labels associated with this workflow. Labels can contain at most 64 entries. Keys and values can be no longer than 63 characters and can only contain lowercase letters, numeric characters, underscores and dashes. Label keys must start with a letter. International characters are allowed.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The resource name of the workflow. Format: projects/{project}/locations/{location}/workflows/{workflow}
     * 
     */
    private final String name;
    /**
     * The timestamp that the latest revision of the workflow was created.
     * 
     */
    private final String revisionCreateTime;
    /**
     * The revision of the workflow. A new revision of a workflow is created as a result of updating the following properties of a workflow: - Service account - Workflow code to be executed The format is "000001-a4d", where the first 6 characters define the zero-padded revision ordinal number. They are followed by a hyphen and 3 hexadecimal random characters.
     * 
     */
    private final String revisionId;
    /**
     * The service account associated with the latest workflow version. This service account represents the identity of the workflow and determines what permissions the workflow has. Format: projects/{project}/serviceAccounts/{account} or {account} Using `-` as a wildcard for the `{project}` or not providing one at all will infer the project from the account. The `{account}` value can be the `email` address or the `unique_id` of the service account. If not provided, workflow will use the project's default service account. Modifying this field for an existing workflow results in a new workflow revision.
     * 
     */
    private final String serviceAccount;
    /**
     * Workflow code to be executed. The size limit is 128KB.
     * 
     */
    private final String sourceContents;
    /**
     * State of the workflow deployment.
     * 
     */
    private final String state;
    /**
     * The last update timestamp of the workflow.
     * 
     */
    private final String updateTime;

    @OutputCustomType.Constructor({"createTime","description","labels","name","revisionCreateTime","revisionId","serviceAccount","sourceContents","state","updateTime"})
    private GetWorkflowResult(
        String createTime,
        String description,
        Map<String,String> labels,
        String name,
        String revisionCreateTime,
        String revisionId,
        String serviceAccount,
        String sourceContents,
        String state,
        String updateTime) {
        this.createTime = Objects.requireNonNull(createTime);
        this.description = Objects.requireNonNull(description);
        this.labels = Objects.requireNonNull(labels);
        this.name = Objects.requireNonNull(name);
        this.revisionCreateTime = Objects.requireNonNull(revisionCreateTime);
        this.revisionId = Objects.requireNonNull(revisionId);
        this.serviceAccount = Objects.requireNonNull(serviceAccount);
        this.sourceContents = Objects.requireNonNull(sourceContents);
        this.state = Objects.requireNonNull(state);
        this.updateTime = Objects.requireNonNull(updateTime);
    }

    /**
     * The timestamp of when the workflow was created.
     * 
     */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Description of the workflow provided by the user. Must be at most 1000 unicode characters long.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Labels associated with this workflow. Labels can contain at most 64 entries. Keys and values can be no longer than 63 characters and can only contain lowercase letters, numeric characters, underscores and dashes. Label keys must start with a letter. International characters are allowed.
     * 
     */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * The resource name of the workflow. Format: projects/{project}/locations/{location}/workflows/{workflow}
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The timestamp that the latest revision of the workflow was created.
     * 
     */
    public String getRevisionCreateTime() {
        return this.revisionCreateTime;
    }
    /**
     * The revision of the workflow. A new revision of a workflow is created as a result of updating the following properties of a workflow: - Service account - Workflow code to be executed The format is "000001-a4d", where the first 6 characters define the zero-padded revision ordinal number. They are followed by a hyphen and 3 hexadecimal random characters.
     * 
     */
    public String getRevisionId() {
        return this.revisionId;
    }
    /**
     * The service account associated with the latest workflow version. This service account represents the identity of the workflow and determines what permissions the workflow has. Format: projects/{project}/serviceAccounts/{account} or {account} Using `-` as a wildcard for the `{project}` or not providing one at all will infer the project from the account. The `{account}` value can be the `email` address or the `unique_id` of the service account. If not provided, workflow will use the project's default service account. Modifying this field for an existing workflow results in a new workflow revision.
     * 
     */
    public String getServiceAccount() {
        return this.serviceAccount;
    }
    /**
     * Workflow code to be executed. The size limit is 128KB.
     * 
     */
    public String getSourceContents() {
        return this.sourceContents;
    }
    /**
     * State of the workflow deployment.
     * 
     */
    public String getState() {
        return this.state;
    }
    /**
     * The last update timestamp of the workflow.
     * 
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkflowResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private Map<String,String> labels;
        private String name;
        private String revisionCreateTime;
        private String revisionId;
        private String serviceAccount;
        private String sourceContents;
        private String state;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkflowResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.revisionCreateTime = defaults.revisionCreateTime;
    	      this.revisionId = defaults.revisionId;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.sourceContents = defaults.sourceContents;
    	      this.state = defaults.state;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRevisionCreateTime(String revisionCreateTime) {
            this.revisionCreateTime = Objects.requireNonNull(revisionCreateTime);
            return this;
        }

        public Builder setRevisionId(String revisionId) {
            this.revisionId = Objects.requireNonNull(revisionId);
            return this;
        }

        public Builder setServiceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }

        public Builder setSourceContents(String sourceContents) {
            this.sourceContents = Objects.requireNonNull(sourceContents);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetWorkflowResult build() {
            return new GetWorkflowResult(createTime, description, labels, name, revisionCreateTime, revisionId, serviceAccount, sourceContents, state, updateTime);
        }
    }
}
