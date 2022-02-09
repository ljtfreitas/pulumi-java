// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.osconfig_v1beta.inputs.AssignmentGroupLabelArgs;
import io.pulumi.googlenative.osconfig_v1beta.inputs.AssignmentOsTypeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AssignmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssignmentArgs Empty = new AssignmentArgs();

    @InputImport(name="groupLabels")
    private final @Nullable Input<List<AssignmentGroupLabelArgs>> groupLabels;

    public Input<List<AssignmentGroupLabelArgs>> getGroupLabels() {
        return this.groupLabels == null ? Input.empty() : this.groupLabels;
    }

    @InputImport(name="instanceNamePrefixes")
    private final @Nullable Input<List<String>> instanceNamePrefixes;

    public Input<List<String>> getInstanceNamePrefixes() {
        return this.instanceNamePrefixes == null ? Input.empty() : this.instanceNamePrefixes;
    }

    @InputImport(name="instances")
    private final @Nullable Input<List<String>> instances;

    public Input<List<String>> getInstances() {
        return this.instances == null ? Input.empty() : this.instances;
    }

    @InputImport(name="osTypes")
    private final @Nullable Input<List<AssignmentOsTypeArgs>> osTypes;

    public Input<List<AssignmentOsTypeArgs>> getOsTypes() {
        return this.osTypes == null ? Input.empty() : this.osTypes;
    }

    @InputImport(name="zones")
    private final @Nullable Input<List<String>> zones;

    public Input<List<String>> getZones() {
        return this.zones == null ? Input.empty() : this.zones;
    }

    public AssignmentArgs(
        @Nullable Input<List<AssignmentGroupLabelArgs>> groupLabels,
        @Nullable Input<List<String>> instanceNamePrefixes,
        @Nullable Input<List<String>> instances,
        @Nullable Input<List<AssignmentOsTypeArgs>> osTypes,
        @Nullable Input<List<String>> zones) {
        this.groupLabels = groupLabels;
        this.instanceNamePrefixes = instanceNamePrefixes;
        this.instances = instances;
        this.osTypes = osTypes;
        this.zones = zones;
    }

    private AssignmentArgs() {
        this.groupLabels = Input.empty();
        this.instanceNamePrefixes = Input.empty();
        this.instances = Input.empty();
        this.osTypes = Input.empty();
        this.zones = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<AssignmentGroupLabelArgs>> groupLabels;
        private @Nullable Input<List<String>> instanceNamePrefixes;
        private @Nullable Input<List<String>> instances;
        private @Nullable Input<List<AssignmentOsTypeArgs>> osTypes;
        private @Nullable Input<List<String>> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(AssignmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupLabels = defaults.groupLabels;
    	      this.instanceNamePrefixes = defaults.instanceNamePrefixes;
    	      this.instances = defaults.instances;
    	      this.osTypes = defaults.osTypes;
    	      this.zones = defaults.zones;
        }

        public Builder setGroupLabels(@Nullable Input<List<AssignmentGroupLabelArgs>> groupLabels) {
            this.groupLabels = groupLabels;
            return this;
        }

        public Builder setGroupLabels(@Nullable List<AssignmentGroupLabelArgs> groupLabels) {
            this.groupLabels = Input.ofNullable(groupLabels);
            return this;
        }

        public Builder setInstanceNamePrefixes(@Nullable Input<List<String>> instanceNamePrefixes) {
            this.instanceNamePrefixes = instanceNamePrefixes;
            return this;
        }

        public Builder setInstanceNamePrefixes(@Nullable List<String> instanceNamePrefixes) {
            this.instanceNamePrefixes = Input.ofNullable(instanceNamePrefixes);
            return this;
        }

        public Builder setInstances(@Nullable Input<List<String>> instances) {
            this.instances = instances;
            return this;
        }

        public Builder setInstances(@Nullable List<String> instances) {
            this.instances = Input.ofNullable(instances);
            return this;
        }

        public Builder setOsTypes(@Nullable Input<List<AssignmentOsTypeArgs>> osTypes) {
            this.osTypes = osTypes;
            return this;
        }

        public Builder setOsTypes(@Nullable List<AssignmentOsTypeArgs> osTypes) {
            this.osTypes = Input.ofNullable(osTypes);
            return this;
        }

        public Builder setZones(@Nullable Input<List<String>> zones) {
            this.zones = zones;
            return this;
        }

        public Builder setZones(@Nullable List<String> zones) {
            this.zones = Input.ofNullable(zones);
            return this;
        }

        public AssignmentArgs build() {
            return new AssignmentArgs(groupLabels, instanceNamePrefixes, instances, osTypes, zones);
        }
    }
}