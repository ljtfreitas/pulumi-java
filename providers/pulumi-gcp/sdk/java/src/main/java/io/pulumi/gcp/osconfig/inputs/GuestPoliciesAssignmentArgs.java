// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesAssignmentGroupLabelArgs;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesAssignmentOsTypeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GuestPoliciesAssignmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestPoliciesAssignmentArgs Empty = new GuestPoliciesAssignmentArgs();

    /**
     * Targets instances matching at least one of these label sets. This allows an assignment to target disparate groups,
     * for example "env=prod or env=staging".
     * Structure is documented below.
     * 
     */
    @Import(name="groupLabels")
      private final @Nullable Output<List<GuestPoliciesAssignmentGroupLabelArgs>> groupLabels;

    public Output<List<GuestPoliciesAssignmentGroupLabelArgs>> groupLabels() {
        return this.groupLabels == null ? Codegen.empty() : this.groupLabels;
    }

    /**
     * Targets VM instances whose name starts with one of these prefixes.
     * Like labels, this is another way to group VM instances when targeting configs,
     * for example prefix="prod-".
     * Only supported for project-level policies.
     * 
     */
    @Import(name="instanceNamePrefixes")
      private final @Nullable Output<List<String>> instanceNamePrefixes;

    public Output<List<String>> instanceNamePrefixes() {
        return this.instanceNamePrefixes == null ? Codegen.empty() : this.instanceNamePrefixes;
    }

    /**
     * Targets any of the instances specified. Instances are specified by their URI in the form
     * zones/[ZONE]/instances/[INSTANCE_NAME].
     * Instance targeting is uncommon and is supported to facilitate the management of changes
     * by the instance or to target specific VM instances for development and testing.
     * Only supported for project-level policies and must reference instances within this project.
     * 
     */
    @Import(name="instances")
      private final @Nullable Output<List<String>> instances;

    public Output<List<String>> instances() {
        return this.instances == null ? Codegen.empty() : this.instances;
    }

    /**
     * Targets VM instances matching at least one of the following OS types.
     * VM instances must match all supplied criteria for a given OsType to be included.
     * Structure is documented below.
     * 
     */
    @Import(name="osTypes")
      private final @Nullable Output<List<GuestPoliciesAssignmentOsTypeArgs>> osTypes;

    public Output<List<GuestPoliciesAssignmentOsTypeArgs>> osTypes() {
        return this.osTypes == null ? Codegen.empty() : this.osTypes;
    }

    /**
     * Targets instances in any of these zones. Leave empty to target instances in any zone.
     * Zonal targeting is uncommon and is supported to facilitate the management of changes by zone.
     * 
     */
    @Import(name="zones")
      private final @Nullable Output<List<String>> zones;

    public Output<List<String>> zones() {
        return this.zones == null ? Codegen.empty() : this.zones;
    }

    public GuestPoliciesAssignmentArgs(
        @Nullable Output<List<GuestPoliciesAssignmentGroupLabelArgs>> groupLabels,
        @Nullable Output<List<String>> instanceNamePrefixes,
        @Nullable Output<List<String>> instances,
        @Nullable Output<List<GuestPoliciesAssignmentOsTypeArgs>> osTypes,
        @Nullable Output<List<String>> zones) {
        this.groupLabels = groupLabels;
        this.instanceNamePrefixes = instanceNamePrefixes;
        this.instances = instances;
        this.osTypes = osTypes;
        this.zones = zones;
    }

    private GuestPoliciesAssignmentArgs() {
        this.groupLabels = Codegen.empty();
        this.instanceNamePrefixes = Codegen.empty();
        this.instances = Codegen.empty();
        this.osTypes = Codegen.empty();
        this.zones = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<GuestPoliciesAssignmentGroupLabelArgs>> groupLabels;
        private @Nullable Output<List<String>> instanceNamePrefixes;
        private @Nullable Output<List<String>> instances;
        private @Nullable Output<List<GuestPoliciesAssignmentOsTypeArgs>> osTypes;
        private @Nullable Output<List<String>> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesAssignmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupLabels = defaults.groupLabels;
    	      this.instanceNamePrefixes = defaults.instanceNamePrefixes;
    	      this.instances = defaults.instances;
    	      this.osTypes = defaults.osTypes;
    	      this.zones = defaults.zones;
        }

        public Builder groupLabels(@Nullable Output<List<GuestPoliciesAssignmentGroupLabelArgs>> groupLabels) {
            this.groupLabels = groupLabels;
            return this;
        }
        public Builder groupLabels(@Nullable List<GuestPoliciesAssignmentGroupLabelArgs> groupLabels) {
            this.groupLabels = Codegen.ofNullable(groupLabels);
            return this;
        }
        public Builder groupLabels(GuestPoliciesAssignmentGroupLabelArgs... groupLabels) {
            return groupLabels(List.of(groupLabels));
        }
        public Builder instanceNamePrefixes(@Nullable Output<List<String>> instanceNamePrefixes) {
            this.instanceNamePrefixes = instanceNamePrefixes;
            return this;
        }
        public Builder instanceNamePrefixes(@Nullable List<String> instanceNamePrefixes) {
            this.instanceNamePrefixes = Codegen.ofNullable(instanceNamePrefixes);
            return this;
        }
        public Builder instanceNamePrefixes(String... instanceNamePrefixes) {
            return instanceNamePrefixes(List.of(instanceNamePrefixes));
        }
        public Builder instances(@Nullable Output<List<String>> instances) {
            this.instances = instances;
            return this;
        }
        public Builder instances(@Nullable List<String> instances) {
            this.instances = Codegen.ofNullable(instances);
            return this;
        }
        public Builder instances(String... instances) {
            return instances(List.of(instances));
        }
        public Builder osTypes(@Nullable Output<List<GuestPoliciesAssignmentOsTypeArgs>> osTypes) {
            this.osTypes = osTypes;
            return this;
        }
        public Builder osTypes(@Nullable List<GuestPoliciesAssignmentOsTypeArgs> osTypes) {
            this.osTypes = Codegen.ofNullable(osTypes);
            return this;
        }
        public Builder osTypes(GuestPoliciesAssignmentOsTypeArgs... osTypes) {
            return osTypes(List.of(osTypes));
        }
        public Builder zones(@Nullable Output<List<String>> zones) {
            this.zones = zones;
            return this;
        }
        public Builder zones(@Nullable List<String> zones) {
            this.zones = Codegen.ofNullable(zones);
            return this;
        }
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }        public GuestPoliciesAssignmentArgs build() {
            return new GuestPoliciesAssignmentArgs(groupLabels, instanceNamePrefixes, instances, osTypes, zones);
        }
    }
}
