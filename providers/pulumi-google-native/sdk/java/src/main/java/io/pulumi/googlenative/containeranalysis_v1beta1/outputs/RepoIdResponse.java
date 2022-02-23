// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.ProjectRepoIdResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RepoIdResponse {
    /**
     * A combination of a project ID and a repo name.
     * 
     */
    private final ProjectRepoIdResponse projectRepoId;
    /**
     * A server-assigned, globally unique identifier.
     * 
     */
    private final String uid;

    @OutputCustomType.Constructor({"projectRepoId","uid"})
    private RepoIdResponse(
        ProjectRepoIdResponse projectRepoId,
        String uid) {
        this.projectRepoId = Objects.requireNonNull(projectRepoId);
        this.uid = Objects.requireNonNull(uid);
    }

    /**
     * A combination of a project ID and a repo name.
     * 
     */
    public ProjectRepoIdResponse getProjectRepoId() {
        return this.projectRepoId;
    }
    /**
     * A server-assigned, globally unique identifier.
     * 
     */
    public String getUid() {
        return this.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepoIdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectRepoIdResponse projectRepoId;
        private String uid;

        public Builder() {
    	      // Empty
        }

        public Builder(RepoIdResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.projectRepoId = defaults.projectRepoId;
    	      this.uid = defaults.uid;
        }

        public Builder setProjectRepoId(ProjectRepoIdResponse projectRepoId) {
            this.projectRepoId = Objects.requireNonNull(projectRepoId);
            return this;
        }

        public Builder setUid(String uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }
        public RepoIdResponse build() {
            return new RepoIdResponse(projectRepoId, uid);
        }
    }
}
