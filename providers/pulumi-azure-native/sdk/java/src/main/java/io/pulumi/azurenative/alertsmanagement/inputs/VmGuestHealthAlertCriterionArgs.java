// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement.inputs;

import io.pulumi.azurenative.alertsmanagement.inputs.HealthStateArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies the health alert criteria to alert on.
 * 
 */
public final class VmGuestHealthAlertCriterionArgs extends io.pulumi.resources.ResourceArgs {

    public static final VmGuestHealthAlertCriterionArgs Empty = new VmGuestHealthAlertCriterionArgs();

    /**
     * Health states to alert on
     * 
     */
    @Import(name="healthStates", required=true)
      private final Output<List<HealthStateArgs>> healthStates;

    public Output<List<HealthStateArgs>> getHealthStates() {
        return this.healthStates;
    }

    /**
     * Names of health monitor on which to define alert
     * 
     */
    @Import(name="monitorNames")
      private final @Nullable Output<List<String>> monitorNames;

    public Output<List<String>> getMonitorNames() {
        return this.monitorNames == null ? Output.empty() : this.monitorNames;
    }

    /**
     * Names of health monitor type on which to define alert
     * 
     */
    @Import(name="monitorTypes")
      private final @Nullable Output<List<String>> monitorTypes;

    public Output<List<String>> getMonitorTypes() {
        return this.monitorTypes == null ? Output.empty() : this.monitorTypes;
    }

    /**
     * specifies the type of the alert criterion.
     * Expected value is 'GuestVmHealth'.
     * 
     */
    @Import(name="namespace", required=true)
      private final Output<String> namespace;

    public Output<String> getNamespace() {
        return this.namespace;
    }

    public VmGuestHealthAlertCriterionArgs(
        Output<List<HealthStateArgs>> healthStates,
        @Nullable Output<List<String>> monitorNames,
        @Nullable Output<List<String>> monitorTypes,
        Output<String> namespace) {
        this.healthStates = Objects.requireNonNull(healthStates, "expected parameter 'healthStates' to be non-null");
        this.monitorNames = monitorNames;
        this.monitorTypes = monitorTypes;
        this.namespace = Objects.requireNonNull(namespace, "expected parameter 'namespace' to be non-null");
    }

    private VmGuestHealthAlertCriterionArgs() {
        this.healthStates = Output.empty();
        this.monitorNames = Output.empty();
        this.monitorTypes = Output.empty();
        this.namespace = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmGuestHealthAlertCriterionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<HealthStateArgs>> healthStates;
        private @Nullable Output<List<String>> monitorNames;
        private @Nullable Output<List<String>> monitorTypes;
        private Output<String> namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(VmGuestHealthAlertCriterionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthStates = defaults.healthStates;
    	      this.monitorNames = defaults.monitorNames;
    	      this.monitorTypes = defaults.monitorTypes;
    	      this.namespace = defaults.namespace;
        }

        public Builder healthStates(Output<List<HealthStateArgs>> healthStates) {
            this.healthStates = Objects.requireNonNull(healthStates);
            return this;
        }

        public Builder healthStates(List<HealthStateArgs> healthStates) {
            this.healthStates = Output.of(Objects.requireNonNull(healthStates));
            return this;
        }

        public Builder monitorNames(@Nullable Output<List<String>> monitorNames) {
            this.monitorNames = monitorNames;
            return this;
        }

        public Builder monitorNames(@Nullable List<String> monitorNames) {
            this.monitorNames = Output.ofNullable(monitorNames);
            return this;
        }

        public Builder monitorTypes(@Nullable Output<List<String>> monitorTypes) {
            this.monitorTypes = monitorTypes;
            return this;
        }

        public Builder monitorTypes(@Nullable List<String> monitorTypes) {
            this.monitorTypes = Output.ofNullable(monitorTypes);
            return this;
        }

        public Builder namespace(Output<String> namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }

        public Builder namespace(String namespace) {
            this.namespace = Output.of(Objects.requireNonNull(namespace));
            return this;
        }
        public VmGuestHealthAlertCriterionArgs build() {
            return new VmGuestHealthAlertCriterionArgs(healthStates, monitorNames, monitorTypes, namespace);
        }
    }
}
