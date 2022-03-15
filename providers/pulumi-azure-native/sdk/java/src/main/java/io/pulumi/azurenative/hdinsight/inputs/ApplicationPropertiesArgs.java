// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.azurenative.hdinsight.inputs.ApplicationGetEndpointArgs;
import io.pulumi.azurenative.hdinsight.inputs.ApplicationGetHttpsEndpointArgs;
import io.pulumi.azurenative.hdinsight.inputs.ComputeProfileArgs;
import io.pulumi.azurenative.hdinsight.inputs.ErrorsArgs;
import io.pulumi.azurenative.hdinsight.inputs.RuntimeScriptActionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The HDInsight cluster application GET response.
 * 
 */
public final class ApplicationPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationPropertiesArgs Empty = new ApplicationPropertiesArgs();

    /**
     * The application type.
     * 
     */
    @Import(name="applicationType")
      private final @Nullable Output<String> applicationType;

    public Output<String> getApplicationType() {
        return this.applicationType == null ? Output.empty() : this.applicationType;
    }

    /**
     * The list of roles in the cluster.
     * 
     */
    @Import(name="computeProfile")
      private final @Nullable Output<ComputeProfileArgs> computeProfile;

    public Output<ComputeProfileArgs> getComputeProfile() {
        return this.computeProfile == null ? Output.empty() : this.computeProfile;
    }

    /**
     * The list of errors.
     * 
     */
    @Import(name="errors")
      private final @Nullable Output<List<ErrorsArgs>> errors;

    public Output<List<ErrorsArgs>> getErrors() {
        return this.errors == null ? Output.empty() : this.errors;
    }

    /**
     * The list of application HTTPS endpoints.
     * 
     */
    @Import(name="httpsEndpoints")
      private final @Nullable Output<List<ApplicationGetHttpsEndpointArgs>> httpsEndpoints;

    public Output<List<ApplicationGetHttpsEndpointArgs>> getHttpsEndpoints() {
        return this.httpsEndpoints == null ? Output.empty() : this.httpsEndpoints;
    }

    /**
     * The list of install script actions.
     * 
     */
    @Import(name="installScriptActions")
      private final @Nullable Output<List<RuntimeScriptActionArgs>> installScriptActions;

    public Output<List<RuntimeScriptActionArgs>> getInstallScriptActions() {
        return this.installScriptActions == null ? Output.empty() : this.installScriptActions;
    }

    /**
     * The list of application SSH endpoints.
     * 
     */
    @Import(name="sshEndpoints")
      private final @Nullable Output<List<ApplicationGetEndpointArgs>> sshEndpoints;

    public Output<List<ApplicationGetEndpointArgs>> getSshEndpoints() {
        return this.sshEndpoints == null ? Output.empty() : this.sshEndpoints;
    }

    /**
     * The list of uninstall script actions.
     * 
     */
    @Import(name="uninstallScriptActions")
      private final @Nullable Output<List<RuntimeScriptActionArgs>> uninstallScriptActions;

    public Output<List<RuntimeScriptActionArgs>> getUninstallScriptActions() {
        return this.uninstallScriptActions == null ? Output.empty() : this.uninstallScriptActions;
    }

    public ApplicationPropertiesArgs(
        @Nullable Output<String> applicationType,
        @Nullable Output<ComputeProfileArgs> computeProfile,
        @Nullable Output<List<ErrorsArgs>> errors,
        @Nullable Output<List<ApplicationGetHttpsEndpointArgs>> httpsEndpoints,
        @Nullable Output<List<RuntimeScriptActionArgs>> installScriptActions,
        @Nullable Output<List<ApplicationGetEndpointArgs>> sshEndpoints,
        @Nullable Output<List<RuntimeScriptActionArgs>> uninstallScriptActions) {
        this.applicationType = applicationType;
        this.computeProfile = computeProfile;
        this.errors = errors;
        this.httpsEndpoints = httpsEndpoints;
        this.installScriptActions = installScriptActions;
        this.sshEndpoints = sshEndpoints;
        this.uninstallScriptActions = uninstallScriptActions;
    }

    private ApplicationPropertiesArgs() {
        this.applicationType = Output.empty();
        this.computeProfile = Output.empty();
        this.errors = Output.empty();
        this.httpsEndpoints = Output.empty();
        this.installScriptActions = Output.empty();
        this.sshEndpoints = Output.empty();
        this.uninstallScriptActions = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> applicationType;
        private @Nullable Output<ComputeProfileArgs> computeProfile;
        private @Nullable Output<List<ErrorsArgs>> errors;
        private @Nullable Output<List<ApplicationGetHttpsEndpointArgs>> httpsEndpoints;
        private @Nullable Output<List<RuntimeScriptActionArgs>> installScriptActions;
        private @Nullable Output<List<ApplicationGetEndpointArgs>> sshEndpoints;
        private @Nullable Output<List<RuntimeScriptActionArgs>> uninstallScriptActions;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationType = defaults.applicationType;
    	      this.computeProfile = defaults.computeProfile;
    	      this.errors = defaults.errors;
    	      this.httpsEndpoints = defaults.httpsEndpoints;
    	      this.installScriptActions = defaults.installScriptActions;
    	      this.sshEndpoints = defaults.sshEndpoints;
    	      this.uninstallScriptActions = defaults.uninstallScriptActions;
        }

        public Builder applicationType(@Nullable Output<String> applicationType) {
            this.applicationType = applicationType;
            return this;
        }

        public Builder applicationType(@Nullable String applicationType) {
            this.applicationType = Output.ofNullable(applicationType);
            return this;
        }

        public Builder computeProfile(@Nullable Output<ComputeProfileArgs> computeProfile) {
            this.computeProfile = computeProfile;
            return this;
        }

        public Builder computeProfile(@Nullable ComputeProfileArgs computeProfile) {
            this.computeProfile = Output.ofNullable(computeProfile);
            return this;
        }

        public Builder errors(@Nullable Output<List<ErrorsArgs>> errors) {
            this.errors = errors;
            return this;
        }

        public Builder errors(@Nullable List<ErrorsArgs> errors) {
            this.errors = Output.ofNullable(errors);
            return this;
        }

        public Builder httpsEndpoints(@Nullable Output<List<ApplicationGetHttpsEndpointArgs>> httpsEndpoints) {
            this.httpsEndpoints = httpsEndpoints;
            return this;
        }

        public Builder httpsEndpoints(@Nullable List<ApplicationGetHttpsEndpointArgs> httpsEndpoints) {
            this.httpsEndpoints = Output.ofNullable(httpsEndpoints);
            return this;
        }

        public Builder installScriptActions(@Nullable Output<List<RuntimeScriptActionArgs>> installScriptActions) {
            this.installScriptActions = installScriptActions;
            return this;
        }

        public Builder installScriptActions(@Nullable List<RuntimeScriptActionArgs> installScriptActions) {
            this.installScriptActions = Output.ofNullable(installScriptActions);
            return this;
        }

        public Builder sshEndpoints(@Nullable Output<List<ApplicationGetEndpointArgs>> sshEndpoints) {
            this.sshEndpoints = sshEndpoints;
            return this;
        }

        public Builder sshEndpoints(@Nullable List<ApplicationGetEndpointArgs> sshEndpoints) {
            this.sshEndpoints = Output.ofNullable(sshEndpoints);
            return this;
        }

        public Builder uninstallScriptActions(@Nullable Output<List<RuntimeScriptActionArgs>> uninstallScriptActions) {
            this.uninstallScriptActions = uninstallScriptActions;
            return this;
        }

        public Builder uninstallScriptActions(@Nullable List<RuntimeScriptActionArgs> uninstallScriptActions) {
            this.uninstallScriptActions = Output.ofNullable(uninstallScriptActions);
            return this;
        }
        public ApplicationPropertiesArgs build() {
            return new ApplicationPropertiesArgs(applicationType, computeProfile, errors, httpsEndpoints, installScriptActions, sshEndpoints, uninstallScriptActions);
        }
    }
}
