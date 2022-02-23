// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetChangeArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetChangeArgs Empty = new GetChangeArgs();

    @InputImport(name="changeId", required=true)
      private final String changeId;

    public String getChangeId() {
        return this.changeId;
    }

    @InputImport(name="clientOperationId")
      private final @Nullable String clientOperationId;

    public Optional<String> getClientOperationId() {
        return this.clientOperationId == null ? Optional.empty() : Optional.ofNullable(this.clientOperationId);
    }

    @InputImport(name="managedZone", required=true)
      private final String managedZone;

    public String getManagedZone() {
        return this.managedZone;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetChangeArgs(
        String changeId,
        @Nullable String clientOperationId,
        String managedZone,
        @Nullable String project) {
        this.changeId = Objects.requireNonNull(changeId, "expected parameter 'changeId' to be non-null");
        this.clientOperationId = clientOperationId;
        this.managedZone = Objects.requireNonNull(managedZone, "expected parameter 'managedZone' to be non-null");
        this.project = project;
    }

    private GetChangeArgs() {
        this.changeId = null;
        this.clientOperationId = null;
        this.managedZone = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetChangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String changeId;
        private @Nullable String clientOperationId;
        private String managedZone;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetChangeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.changeId = defaults.changeId;
    	      this.clientOperationId = defaults.clientOperationId;
    	      this.managedZone = defaults.managedZone;
    	      this.project = defaults.project;
        }

        public Builder setChangeId(String changeId) {
            this.changeId = Objects.requireNonNull(changeId);
            return this;
        }

        public Builder setClientOperationId(@Nullable String clientOperationId) {
            this.clientOperationId = clientOperationId;
            return this;
        }

        public Builder setManagedZone(String managedZone) {
            this.managedZone = Objects.requireNonNull(managedZone);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }
        public GetChangeArgs build() {
            return new GetChangeArgs(changeId, clientOperationId, managedZone, project);
        }
    }
}
