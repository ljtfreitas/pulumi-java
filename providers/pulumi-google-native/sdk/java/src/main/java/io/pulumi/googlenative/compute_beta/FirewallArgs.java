// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.enums.FirewallDirection;
import io.pulumi.googlenative.compute_beta.inputs.FirewallAllowedItemArgs;
import io.pulumi.googlenative.compute_beta.inputs.FirewallDeniedItemArgs;
import io.pulumi.googlenative.compute_beta.inputs.FirewallLogConfigArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallArgs Empty = new FirewallArgs();

    /**
     * The list of ALLOW rules specified by this firewall. Each rule specifies a protocol and port-range tuple that describes a permitted connection.
     * 
     */
    @InputImport(name="allowed")
      private final @Nullable Input<List<FirewallAllowedItemArgs>> allowed;

    public Input<List<FirewallAllowedItemArgs>> getAllowed() {
        return this.allowed == null ? Input.empty() : this.allowed;
    }

    /**
     * The list of DENY rules specified by this firewall. Each rule specifies a protocol and port-range tuple that describes a denied connection.
     * 
     */
    @InputImport(name="denied")
      private final @Nullable Input<List<FirewallDeniedItemArgs>> denied;

    public Input<List<FirewallDeniedItemArgs>> getDenied() {
        return this.denied == null ? Input.empty() : this.denied;
    }

    /**
     * An optional description of this resource. Provide this field when you create the resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * If destination ranges are specified, the firewall rule applies only to traffic that has destination IP address in these ranges. These ranges must be expressed in CIDR format. Both IPv4 and IPv6 are supported.
     * 
     */
    @InputImport(name="destinationRanges")
      private final @Nullable Input<List<String>> destinationRanges;

    public Input<List<String>> getDestinationRanges() {
        return this.destinationRanges == null ? Input.empty() : this.destinationRanges;
    }

    /**
     * Direction of traffic to which this firewall applies, either `INGRESS` or `EGRESS`. The default is `INGRESS`. For `INGRESS` traffic, you cannot specify the destinationRanges field, and for `EGRESS` traffic, you cannot specify the sourceRanges or sourceTags fields.
     * 
     */
    @InputImport(name="direction")
      private final @Nullable Input<FirewallDirection> direction;

    public Input<FirewallDirection> getDirection() {
        return this.direction == null ? Input.empty() : this.direction;
    }

    /**
     * Denotes whether the firewall rule is disabled. When set to true, the firewall rule is not enforced and the network behaves as if it did not exist. If this is unspecified, the firewall rule will be enabled.
     * 
     */
    @InputImport(name="disabled")
      private final @Nullable Input<Boolean> disabled;

    public Input<Boolean> getDisabled() {
        return this.disabled == null ? Input.empty() : this.disabled;
    }

    /**
     * This field denotes the logging options for a particular firewall rule. If logging is enabled, logs will be exported to Cloud Logging.
     * 
     */
    @InputImport(name="logConfig")
      private final @Nullable Input<FirewallLogConfigArgs> logConfig;

    public Input<FirewallLogConfigArgs> getLogConfig() {
        return this.logConfig == null ? Input.empty() : this.logConfig;
    }

    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * URL of the network resource for this firewall rule. If not specified when creating a firewall rule, the default network is used: global/networks/default If you choose to specify this field, you can specify the network as a full or partial URL. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/myproject/global/networks/my-network - projects/myproject/global/networks/my-network - global/networks/default
     * 
     */
    @InputImport(name="network")
      private final @Nullable Input<String> network;

    public Input<String> getNetwork() {
        return this.network == null ? Input.empty() : this.network;
    }

    /**
     * Priority for this rule. This is an integer between `0` and `65535`, both inclusive. The default value is `1000`. Relative priorities determine which rule takes effect if multiple rules apply. Lower values indicate higher priority. For example, a rule with priority `0` has higher precedence than a rule with priority `1`. DENY rules take precedence over ALLOW rules if they have equal priority. Note that VPC networks have implied rules with a priority of `65535`. To avoid conflicts with the implied rules, use a priority number less than `65535`.
     * 
     */
    @InputImport(name="priority")
      private final @Nullable Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority == null ? Input.empty() : this.priority;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="requestId")
      private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * If source ranges are specified, the firewall rule applies only to traffic that has a source IP address in these ranges. These ranges must be expressed in CIDR format. One or both of sourceRanges and sourceTags may be set. If both fields are set, the rule applies to traffic that has a source IP address within sourceRanges OR a source IP from a resource with a matching tag listed in the sourceTags field. The connection does not need to match both fields for the rule to apply. Both IPv4 and IPv6 are supported.
     * 
     */
    @InputImport(name="sourceRanges")
      private final @Nullable Input<List<String>> sourceRanges;

    public Input<List<String>> getSourceRanges() {
        return this.sourceRanges == null ? Input.empty() : this.sourceRanges;
    }

    /**
     * If source service accounts are specified, the firewall rules apply only to traffic originating from an instance with a service account in this list. Source service accounts cannot be used to control traffic to an instance's external IP address because service accounts are associated with an instance, not an IP address. sourceRanges can be set at the same time as sourceServiceAccounts. If both are set, the firewall applies to traffic that has a source IP address within the sourceRanges OR a source IP that belongs to an instance with service account listed in sourceServiceAccount. The connection does not need to match both fields for the firewall to apply. sourceServiceAccounts cannot be used at the same time as sourceTags or targetTags.
     * 
     */
    @InputImport(name="sourceServiceAccounts")
      private final @Nullable Input<List<String>> sourceServiceAccounts;

    public Input<List<String>> getSourceServiceAccounts() {
        return this.sourceServiceAccounts == null ? Input.empty() : this.sourceServiceAccounts;
    }

    /**
     * If source tags are specified, the firewall rule applies only to traffic with source IPs that match the primary network interfaces of VM instances that have the tag and are in the same VPC network. Source tags cannot be used to control traffic to an instance's external IP address, it only applies to traffic between instances in the same virtual network. Because tags are associated with instances, not IP addresses. One or both of sourceRanges and sourceTags may be set. If both fields are set, the firewall applies to traffic that has a source IP address within sourceRanges OR a source IP from a resource with a matching tag listed in the sourceTags field. The connection does not need to match both fields for the firewall to apply.
     * 
     */
    @InputImport(name="sourceTags")
      private final @Nullable Input<List<String>> sourceTags;

    public Input<List<String>> getSourceTags() {
        return this.sourceTags == null ? Input.empty() : this.sourceTags;
    }

    /**
     * A list of service accounts indicating sets of instances located in the network that may make network connections as specified in allowed[]. targetServiceAccounts cannot be used at the same time as targetTags or sourceTags. If neither targetServiceAccounts nor targetTags are specified, the firewall rule applies to all instances on the specified network.
     * 
     */
    @InputImport(name="targetServiceAccounts")
      private final @Nullable Input<List<String>> targetServiceAccounts;

    public Input<List<String>> getTargetServiceAccounts() {
        return this.targetServiceAccounts == null ? Input.empty() : this.targetServiceAccounts;
    }

    /**
     * A list of tags that controls which instances the firewall rule applies to. If targetTags are specified, then the firewall rule applies only to instances in the VPC network that have one of those tags. If no targetTags are specified, the firewall rule applies to all instances on the specified network.
     * 
     */
    @InputImport(name="targetTags")
      private final @Nullable Input<List<String>> targetTags;

    public Input<List<String>> getTargetTags() {
        return this.targetTags == null ? Input.empty() : this.targetTags;
    }

    public FirewallArgs(
        @Nullable Input<List<FirewallAllowedItemArgs>> allowed,
        @Nullable Input<List<FirewallDeniedItemArgs>> denied,
        @Nullable Input<String> description,
        @Nullable Input<List<String>> destinationRanges,
        @Nullable Input<FirewallDirection> direction,
        @Nullable Input<Boolean> disabled,
        @Nullable Input<FirewallLogConfigArgs> logConfig,
        @Nullable Input<String> name,
        @Nullable Input<String> network,
        @Nullable Input<Integer> priority,
        @Nullable Input<String> project,
        @Nullable Input<String> requestId,
        @Nullable Input<List<String>> sourceRanges,
        @Nullable Input<List<String>> sourceServiceAccounts,
        @Nullable Input<List<String>> sourceTags,
        @Nullable Input<List<String>> targetServiceAccounts,
        @Nullable Input<List<String>> targetTags) {
        this.allowed = allowed;
        this.denied = denied;
        this.description = description;
        this.destinationRanges = destinationRanges;
        this.direction = direction;
        this.disabled = disabled;
        this.logConfig = logConfig;
        this.name = name;
        this.network = network;
        this.priority = priority;
        this.project = project;
        this.requestId = requestId;
        this.sourceRanges = sourceRanges;
        this.sourceServiceAccounts = sourceServiceAccounts;
        this.sourceTags = sourceTags;
        this.targetServiceAccounts = targetServiceAccounts;
        this.targetTags = targetTags;
    }

    private FirewallArgs() {
        this.allowed = Input.empty();
        this.denied = Input.empty();
        this.description = Input.empty();
        this.destinationRanges = Input.empty();
        this.direction = Input.empty();
        this.disabled = Input.empty();
        this.logConfig = Input.empty();
        this.name = Input.empty();
        this.network = Input.empty();
        this.priority = Input.empty();
        this.project = Input.empty();
        this.requestId = Input.empty();
        this.sourceRanges = Input.empty();
        this.sourceServiceAccounts = Input.empty();
        this.sourceTags = Input.empty();
        this.targetServiceAccounts = Input.empty();
        this.targetTags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<FirewallAllowedItemArgs>> allowed;
        private @Nullable Input<List<FirewallDeniedItemArgs>> denied;
        private @Nullable Input<String> description;
        private @Nullable Input<List<String>> destinationRanges;
        private @Nullable Input<FirewallDirection> direction;
        private @Nullable Input<Boolean> disabled;
        private @Nullable Input<FirewallLogConfigArgs> logConfig;
        private @Nullable Input<String> name;
        private @Nullable Input<String> network;
        private @Nullable Input<Integer> priority;
        private @Nullable Input<String> project;
        private @Nullable Input<String> requestId;
        private @Nullable Input<List<String>> sourceRanges;
        private @Nullable Input<List<String>> sourceServiceAccounts;
        private @Nullable Input<List<String>> sourceTags;
        private @Nullable Input<List<String>> targetServiceAccounts;
        private @Nullable Input<List<String>> targetTags;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowed = defaults.allowed;
    	      this.denied = defaults.denied;
    	      this.description = defaults.description;
    	      this.destinationRanges = defaults.destinationRanges;
    	      this.direction = defaults.direction;
    	      this.disabled = defaults.disabled;
    	      this.logConfig = defaults.logConfig;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.priority = defaults.priority;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.sourceRanges = defaults.sourceRanges;
    	      this.sourceServiceAccounts = defaults.sourceServiceAccounts;
    	      this.sourceTags = defaults.sourceTags;
    	      this.targetServiceAccounts = defaults.targetServiceAccounts;
    	      this.targetTags = defaults.targetTags;
        }

        public Builder setAllowed(@Nullable Input<List<FirewallAllowedItemArgs>> allowed) {
            this.allowed = allowed;
            return this;
        }

        public Builder setAllowed(@Nullable List<FirewallAllowedItemArgs> allowed) {
            this.allowed = Input.ofNullable(allowed);
            return this;
        }

        public Builder setDenied(@Nullable Input<List<FirewallDeniedItemArgs>> denied) {
            this.denied = denied;
            return this;
        }

        public Builder setDenied(@Nullable List<FirewallDeniedItemArgs> denied) {
            this.denied = Input.ofNullable(denied);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDestinationRanges(@Nullable Input<List<String>> destinationRanges) {
            this.destinationRanges = destinationRanges;
            return this;
        }

        public Builder setDestinationRanges(@Nullable List<String> destinationRanges) {
            this.destinationRanges = Input.ofNullable(destinationRanges);
            return this;
        }

        public Builder setDirection(@Nullable Input<FirewallDirection> direction) {
            this.direction = direction;
            return this;
        }

        public Builder setDirection(@Nullable FirewallDirection direction) {
            this.direction = Input.ofNullable(direction);
            return this;
        }

        public Builder setDisabled(@Nullable Input<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }

        public Builder setDisabled(@Nullable Boolean disabled) {
            this.disabled = Input.ofNullable(disabled);
            return this;
        }

        public Builder setLogConfig(@Nullable Input<FirewallLogConfigArgs> logConfig) {
            this.logConfig = logConfig;
            return this;
        }

        public Builder setLogConfig(@Nullable FirewallLogConfigArgs logConfig) {
            this.logConfig = Input.ofNullable(logConfig);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNetwork(@Nullable Input<String> network) {
            this.network = network;
            return this;
        }

        public Builder setNetwork(@Nullable String network) {
            this.network = Input.ofNullable(network);
            return this;
        }

        public Builder setPriority(@Nullable Input<Integer> priority) {
            this.priority = priority;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = Input.ofNullable(priority);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder setSourceRanges(@Nullable Input<List<String>> sourceRanges) {
            this.sourceRanges = sourceRanges;
            return this;
        }

        public Builder setSourceRanges(@Nullable List<String> sourceRanges) {
            this.sourceRanges = Input.ofNullable(sourceRanges);
            return this;
        }

        public Builder setSourceServiceAccounts(@Nullable Input<List<String>> sourceServiceAccounts) {
            this.sourceServiceAccounts = sourceServiceAccounts;
            return this;
        }

        public Builder setSourceServiceAccounts(@Nullable List<String> sourceServiceAccounts) {
            this.sourceServiceAccounts = Input.ofNullable(sourceServiceAccounts);
            return this;
        }

        public Builder setSourceTags(@Nullable Input<List<String>> sourceTags) {
            this.sourceTags = sourceTags;
            return this;
        }

        public Builder setSourceTags(@Nullable List<String> sourceTags) {
            this.sourceTags = Input.ofNullable(sourceTags);
            return this;
        }

        public Builder setTargetServiceAccounts(@Nullable Input<List<String>> targetServiceAccounts) {
            this.targetServiceAccounts = targetServiceAccounts;
            return this;
        }

        public Builder setTargetServiceAccounts(@Nullable List<String> targetServiceAccounts) {
            this.targetServiceAccounts = Input.ofNullable(targetServiceAccounts);
            return this;
        }

        public Builder setTargetTags(@Nullable Input<List<String>> targetTags) {
            this.targetTags = targetTags;
            return this;
        }

        public Builder setTargetTags(@Nullable List<String> targetTags) {
            this.targetTags = Input.ofNullable(targetTags);
            return this;
        }
        public FirewallArgs build() {
            return new FirewallArgs(allowed, denied, description, destinationRanges, direction, disabled, logConfig, name, network, priority, project, requestId, sourceRanges, sourceServiceAccounts, sourceTags, targetServiceAccounts, targetTags);
        }
    }
}
