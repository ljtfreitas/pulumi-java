// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TargetIpFilterRuleResponse {
    /**
     * The desired action for requests captured by this rule.
     * 
     */
    private final String action;
    /**
     * The name of the IP filter rule.
     * 
     */
    private final String filterName;
    /**
     * A string that contains the IP address range in CIDR notation for the rule.
     * 
     */
    private final String ipMask;
    /**
     * Target for requests captured by this rule.
     * 
     */
    private final @Nullable String target;

    @OutputCustomType.Constructor({"action","filterName","ipMask","target"})
    private TargetIpFilterRuleResponse(
        String action,
        String filterName,
        String ipMask,
        @Nullable String target) {
        this.action = Objects.requireNonNull(action);
        this.filterName = Objects.requireNonNull(filterName);
        this.ipMask = Objects.requireNonNull(ipMask);
        this.target = target;
    }

    /**
     * The desired action for requests captured by this rule.
     * 
     */
    public String getAction() {
        return this.action;
    }
    /**
     * The name of the IP filter rule.
     * 
     */
    public String getFilterName() {
        return this.filterName;
    }
    /**
     * A string that contains the IP address range in CIDR notation for the rule.
     * 
     */
    public String getIpMask() {
        return this.ipMask;
    }
    /**
     * Target for requests captured by this rule.
     * 
     */
    public Optional<String> getTarget() {
        return Optional.ofNullable(this.target);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetIpFilterRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private String filterName;
        private String ipMask;
        private @Nullable String target;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetIpFilterRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.filterName = defaults.filterName;
    	      this.ipMask = defaults.ipMask;
    	      this.target = defaults.target;
        }

        public Builder setAction(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setFilterName(String filterName) {
            this.filterName = Objects.requireNonNull(filterName);
            return this;
        }

        public Builder setIpMask(String ipMask) {
            this.ipMask = Objects.requireNonNull(ipMask);
            return this;
        }

        public Builder setTarget(@Nullable String target) {
            this.target = target;
            return this;
        }
        public TargetIpFilterRuleResponse build() {
            return new TargetIpFilterRuleResponse(action, filterName, ipMask, target);
        }
    }
}
