// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.folder.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.folder.outputs.GetOrganizationPolicyBooleanPolicy;
import io.pulumi.gcp.folder.outputs.GetOrganizationPolicyListPolicy;
import io.pulumi.gcp.folder.outputs.GetOrganizationPolicyRestorePolicy;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetOrganizationPolicyResult {
    private final List<GetOrganizationPolicyBooleanPolicy> booleanPolicies;
    private final String constraint;
    private final String etag;
    private final String folder;
    private final String id;
    private final List<GetOrganizationPolicyListPolicy> listPolicies;
    private final List<GetOrganizationPolicyRestorePolicy> restorePolicies;
    private final String updateTime;
    private final Integer version;

    @OutputCustomType.Constructor({"booleanPolicies","constraint","etag","folder","id","listPolicies","restorePolicies","updateTime","version"})
    private GetOrganizationPolicyResult(
        List<GetOrganizationPolicyBooleanPolicy> booleanPolicies,
        String constraint,
        String etag,
        String folder,
        String id,
        List<GetOrganizationPolicyListPolicy> listPolicies,
        List<GetOrganizationPolicyRestorePolicy> restorePolicies,
        String updateTime,
        Integer version) {
        this.booleanPolicies = Objects.requireNonNull(booleanPolicies);
        this.constraint = Objects.requireNonNull(constraint);
        this.etag = Objects.requireNonNull(etag);
        this.folder = Objects.requireNonNull(folder);
        this.id = Objects.requireNonNull(id);
        this.listPolicies = Objects.requireNonNull(listPolicies);
        this.restorePolicies = Objects.requireNonNull(restorePolicies);
        this.updateTime = Objects.requireNonNull(updateTime);
        this.version = Objects.requireNonNull(version);
    }

    public List<GetOrganizationPolicyBooleanPolicy> getBooleanPolicies() {
        return this.booleanPolicies;
    }
    public String getConstraint() {
        return this.constraint;
    }
    public String getEtag() {
        return this.etag;
    }
    public String getFolder() {
        return this.folder;
    }
    public String getId() {
        return this.id;
    }
    public List<GetOrganizationPolicyListPolicy> getListPolicies() {
        return this.listPolicies;
    }
    public List<GetOrganizationPolicyRestorePolicy> getRestorePolicies() {
        return this.restorePolicies;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }
    public Integer getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetOrganizationPolicyBooleanPolicy> booleanPolicies;
        private String constraint;
        private String etag;
        private String folder;
        private String id;
        private List<GetOrganizationPolicyListPolicy> listPolicies;
        private List<GetOrganizationPolicyRestorePolicy> restorePolicies;
        private String updateTime;
        private Integer version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrganizationPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.booleanPolicies = defaults.booleanPolicies;
    	      this.constraint = defaults.constraint;
    	      this.etag = defaults.etag;
    	      this.folder = defaults.folder;
    	      this.id = defaults.id;
    	      this.listPolicies = defaults.listPolicies;
    	      this.restorePolicies = defaults.restorePolicies;
    	      this.updateTime = defaults.updateTime;
    	      this.version = defaults.version;
        }

        public Builder setBooleanPolicies(List<GetOrganizationPolicyBooleanPolicy> booleanPolicies) {
            this.booleanPolicies = Objects.requireNonNull(booleanPolicies);
            return this;
        }

        public Builder setConstraint(String constraint) {
            this.constraint = Objects.requireNonNull(constraint);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setFolder(String folder) {
            this.folder = Objects.requireNonNull(folder);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setListPolicies(List<GetOrganizationPolicyListPolicy> listPolicies) {
            this.listPolicies = Objects.requireNonNull(listPolicies);
            return this;
        }

        public Builder setRestorePolicies(List<GetOrganizationPolicyRestorePolicy> restorePolicies) {
            this.restorePolicies = Objects.requireNonNull(restorePolicies);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public Builder setVersion(Integer version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public GetOrganizationPolicyResult build() {
            return new GetOrganizationPolicyResult(booleanPolicies, constraint, etag, folder, id, listPolicies, restorePolicies, updateTime, version);
        }
    }
}