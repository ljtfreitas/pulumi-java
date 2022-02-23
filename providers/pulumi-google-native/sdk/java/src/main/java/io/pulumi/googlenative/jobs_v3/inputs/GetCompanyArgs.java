// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.jobs_v3.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCompanyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetCompanyArgs Empty = new GetCompanyArgs();

    @InputImport(name="companyId", required=true)
      private final String companyId;

    public String getCompanyId() {
        return this.companyId;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetCompanyArgs(
        String companyId,
        @Nullable String project) {
        this.companyId = Objects.requireNonNull(companyId, "expected parameter 'companyId' to be non-null");
        this.project = project;
    }

    private GetCompanyArgs() {
        this.companyId = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCompanyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String companyId;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCompanyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.companyId = defaults.companyId;
    	      this.project = defaults.project;
        }

        public Builder setCompanyId(String companyId) {
            this.companyId = Objects.requireNonNull(companyId);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }
        public GetCompanyArgs build() {
            return new GetCompanyArgs(companyId, project);
        }
    }
}
