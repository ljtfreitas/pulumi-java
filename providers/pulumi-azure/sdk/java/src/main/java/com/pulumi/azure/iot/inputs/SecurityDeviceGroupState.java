// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot.inputs;

import com.pulumi.azure.iot.inputs.SecurityDeviceGroupAllowRuleArgs;
import com.pulumi.azure.iot.inputs.SecurityDeviceGroupRangeRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecurityDeviceGroupState extends com.pulumi.resources.ResourceArgs {

    public static final SecurityDeviceGroupState Empty = new SecurityDeviceGroupState();

    /**
     * an `allow_rule` blocks as defined below.
     * 
     */
    @Import(name="allowRule")
    private @Nullable Output<SecurityDeviceGroupAllowRuleArgs> allowRule;

    /**
     * @return an `allow_rule` blocks as defined below.
     * 
     */
    public Optional<Output<SecurityDeviceGroupAllowRuleArgs>> allowRule() {
        return Optional.ofNullable(this.allowRule);
    }

    /**
     * The ID of the IoT Hub which to link the Security Device Group to. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="iothubId")
    private @Nullable Output<String> iothubId;

    /**
     * @return The ID of the IoT Hub which to link the Security Device Group to. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> iothubId() {
        return Optional.ofNullable(this.iothubId);
    }

    /**
     * Specifies the name of the Device Security Group. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Device Security Group. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * One or more `range_rule` blocks as defined below.
     * 
     */
    @Import(name="rangeRules")
    private @Nullable Output<List<SecurityDeviceGroupRangeRuleArgs>> rangeRules;

    /**
     * @return One or more `range_rule` blocks as defined below.
     * 
     */
    public Optional<Output<List<SecurityDeviceGroupRangeRuleArgs>>> rangeRules() {
        return Optional.ofNullable(this.rangeRules);
    }

    private SecurityDeviceGroupState() {}

    private SecurityDeviceGroupState(SecurityDeviceGroupState $) {
        this.allowRule = $.allowRule;
        this.iothubId = $.iothubId;
        this.name = $.name;
        this.rangeRules = $.rangeRules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityDeviceGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityDeviceGroupState $;

        public Builder() {
            $ = new SecurityDeviceGroupState();
        }

        public Builder(SecurityDeviceGroupState defaults) {
            $ = new SecurityDeviceGroupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowRule an `allow_rule` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder allowRule(@Nullable Output<SecurityDeviceGroupAllowRuleArgs> allowRule) {
            $.allowRule = allowRule;
            return this;
        }

        /**
         * @param allowRule an `allow_rule` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder allowRule(SecurityDeviceGroupAllowRuleArgs allowRule) {
            return allowRule(Output.of(allowRule));
        }

        /**
         * @param iothubId The ID of the IoT Hub which to link the Security Device Group to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder iothubId(@Nullable Output<String> iothubId) {
            $.iothubId = iothubId;
            return this;
        }

        /**
         * @param iothubId The ID of the IoT Hub which to link the Security Device Group to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder iothubId(String iothubId) {
            return iothubId(Output.of(iothubId));
        }

        /**
         * @param name Specifies the name of the Device Security Group. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Device Security Group. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param rangeRules One or more `range_rule` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder rangeRules(@Nullable Output<List<SecurityDeviceGroupRangeRuleArgs>> rangeRules) {
            $.rangeRules = rangeRules;
            return this;
        }

        /**
         * @param rangeRules One or more `range_rule` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder rangeRules(List<SecurityDeviceGroupRangeRuleArgs> rangeRules) {
            return rangeRules(Output.of(rangeRules));
        }

        /**
         * @param rangeRules One or more `range_rule` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder rangeRules(SecurityDeviceGroupRangeRuleArgs... rangeRules) {
            return rangeRules(List.of(rangeRules));
        }

        public SecurityDeviceGroupState build() {
            return $;
        }
    }

}
