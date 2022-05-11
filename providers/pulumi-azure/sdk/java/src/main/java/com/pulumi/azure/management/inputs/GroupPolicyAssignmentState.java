// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.management.inputs;

import com.pulumi.azure.management.inputs.GroupPolicyAssignmentIdentityArgs;
import com.pulumi.azure.management.inputs.GroupPolicyAssignmentNonComplianceMessageArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupPolicyAssignmentState extends com.pulumi.resources.ResourceArgs {

    public static final GroupPolicyAssignmentState Empty = new GroupPolicyAssignmentState();

    /**
     * A description which should be used for this Policy Assignment.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description which should be used for this Policy Assignment.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The Display Name for this Policy Assignment.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The Display Name for this Policy Assignment.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Specifies if this Policy should be enforced or not?
     * 
     */
    @Import(name="enforce")
    private @Nullable Output<Boolean> enforce;

    /**
     * @return Specifies if this Policy should be enforced or not?
     * 
     */
    public Optional<Output<Boolean>> enforce() {
        return Optional.ofNullable(this.enforce);
    }

    /**
     * An `identity` block as defined below.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<GroupPolicyAssignmentIdentityArgs> identity;

    /**
     * @return An `identity` block as defined below.
     * 
     */
    public Optional<Output<GroupPolicyAssignmentIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * The Azure Region where the Policy Assignment should exist. Changing this forces a new Policy Assignment to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure Region where the Policy Assignment should exist. Changing this forces a new Policy Assignment to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The ID of the Management Group. Changing this forces a new Policy Assignment to be created.
     * 
     */
    @Import(name="managementGroupId")
    private @Nullable Output<String> managementGroupId;

    /**
     * @return The ID of the Management Group. Changing this forces a new Policy Assignment to be created.
     * 
     */
    public Optional<Output<String>> managementGroupId() {
        return Optional.ofNullable(this.managementGroupId);
    }

    /**
     * A JSON mapping of any Metadata for this Policy.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<String> metadata;

    /**
     * @return A JSON mapping of any Metadata for this Policy.
     * 
     */
    public Optional<Output<String>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * The name which should be used for this Policy Assignment. Changing this forces a new Policy Assignment to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Policy Assignment. Changing this forces a new Policy Assignment to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * One or more `non_compliance_message` blocks as defined below.
     * 
     */
    @Import(name="nonComplianceMessages")
    private @Nullable Output<List<GroupPolicyAssignmentNonComplianceMessageArgs>> nonComplianceMessages;

    /**
     * @return One or more `non_compliance_message` blocks as defined below.
     * 
     */
    public Optional<Output<List<GroupPolicyAssignmentNonComplianceMessageArgs>>> nonComplianceMessages() {
        return Optional.ofNullable(this.nonComplianceMessages);
    }

    /**
     * Specifies a list of Resource Scopes (for example a Subscription, or a Resource Group) within this Management Group which are excluded from this Policy.
     * 
     */
    @Import(name="notScopes")
    private @Nullable Output<List<String>> notScopes;

    /**
     * @return Specifies a list of Resource Scopes (for example a Subscription, or a Resource Group) within this Management Group which are excluded from this Policy.
     * 
     */
    public Optional<Output<List<String>>> notScopes() {
        return Optional.ofNullable(this.notScopes);
    }

    /**
     * A JSON mapping of any Parameters for this Policy.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<String> parameters;

    /**
     * @return A JSON mapping of any Parameters for this Policy.
     * 
     */
    public Optional<Output<String>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The ID of the Policy Definition or Policy Definition Set. Changing this forces a new Policy Assignment to be created.
     * 
     */
    @Import(name="policyDefinitionId")
    private @Nullable Output<String> policyDefinitionId;

    /**
     * @return The ID of the Policy Definition or Policy Definition Set. Changing this forces a new Policy Assignment to be created.
     * 
     */
    public Optional<Output<String>> policyDefinitionId() {
        return Optional.ofNullable(this.policyDefinitionId);
    }

    private GroupPolicyAssignmentState() {}

    private GroupPolicyAssignmentState(GroupPolicyAssignmentState $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.enforce = $.enforce;
        this.identity = $.identity;
        this.location = $.location;
        this.managementGroupId = $.managementGroupId;
        this.metadata = $.metadata;
        this.name = $.name;
        this.nonComplianceMessages = $.nonComplianceMessages;
        this.notScopes = $.notScopes;
        this.parameters = $.parameters;
        this.policyDefinitionId = $.policyDefinitionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupPolicyAssignmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupPolicyAssignmentState $;

        public Builder() {
            $ = new GroupPolicyAssignmentState();
        }

        public Builder(GroupPolicyAssignmentState defaults) {
            $ = new GroupPolicyAssignmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A description which should be used for this Policy Assignment.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description which should be used for this Policy Assignment.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName The Display Name for this Policy Assignment.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The Display Name for this Policy Assignment.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param enforce Specifies if this Policy should be enforced or not?
         * 
         * @return builder
         * 
         */
        public Builder enforce(@Nullable Output<Boolean> enforce) {
            $.enforce = enforce;
            return this;
        }

        /**
         * @param enforce Specifies if this Policy should be enforced or not?
         * 
         * @return builder
         * 
         */
        public Builder enforce(Boolean enforce) {
            return enforce(Output.of(enforce));
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<GroupPolicyAssignmentIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(GroupPolicyAssignmentIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param location The Azure Region where the Policy Assignment should exist. Changing this forces a new Policy Assignment to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure Region where the Policy Assignment should exist. Changing this forces a new Policy Assignment to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param managementGroupId The ID of the Management Group. Changing this forces a new Policy Assignment to be created.
         * 
         * @return builder
         * 
         */
        public Builder managementGroupId(@Nullable Output<String> managementGroupId) {
            $.managementGroupId = managementGroupId;
            return this;
        }

        /**
         * @param managementGroupId The ID of the Management Group. Changing this forces a new Policy Assignment to be created.
         * 
         * @return builder
         * 
         */
        public Builder managementGroupId(String managementGroupId) {
            return managementGroupId(Output.of(managementGroupId));
        }

        /**
         * @param metadata A JSON mapping of any Metadata for this Policy.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<String> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata A JSON mapping of any Metadata for this Policy.
         * 
         * @return builder
         * 
         */
        public Builder metadata(String metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param name The name which should be used for this Policy Assignment. Changing this forces a new Policy Assignment to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Policy Assignment. Changing this forces a new Policy Assignment to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nonComplianceMessages One or more `non_compliance_message` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder nonComplianceMessages(@Nullable Output<List<GroupPolicyAssignmentNonComplianceMessageArgs>> nonComplianceMessages) {
            $.nonComplianceMessages = nonComplianceMessages;
            return this;
        }

        /**
         * @param nonComplianceMessages One or more `non_compliance_message` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder nonComplianceMessages(List<GroupPolicyAssignmentNonComplianceMessageArgs> nonComplianceMessages) {
            return nonComplianceMessages(Output.of(nonComplianceMessages));
        }

        /**
         * @param nonComplianceMessages One or more `non_compliance_message` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder nonComplianceMessages(GroupPolicyAssignmentNonComplianceMessageArgs... nonComplianceMessages) {
            return nonComplianceMessages(List.of(nonComplianceMessages));
        }

        /**
         * @param notScopes Specifies a list of Resource Scopes (for example a Subscription, or a Resource Group) within this Management Group which are excluded from this Policy.
         * 
         * @return builder
         * 
         */
        public Builder notScopes(@Nullable Output<List<String>> notScopes) {
            $.notScopes = notScopes;
            return this;
        }

        /**
         * @param notScopes Specifies a list of Resource Scopes (for example a Subscription, or a Resource Group) within this Management Group which are excluded from this Policy.
         * 
         * @return builder
         * 
         */
        public Builder notScopes(List<String> notScopes) {
            return notScopes(Output.of(notScopes));
        }

        /**
         * @param notScopes Specifies a list of Resource Scopes (for example a Subscription, or a Resource Group) within this Management Group which are excluded from this Policy.
         * 
         * @return builder
         * 
         */
        public Builder notScopes(String... notScopes) {
            return notScopes(List.of(notScopes));
        }

        /**
         * @param parameters A JSON mapping of any Parameters for this Policy.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<String> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters A JSON mapping of any Parameters for this Policy.
         * 
         * @return builder
         * 
         */
        public Builder parameters(String parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param policyDefinitionId The ID of the Policy Definition or Policy Definition Set. Changing this forces a new Policy Assignment to be created.
         * 
         * @return builder
         * 
         */
        public Builder policyDefinitionId(@Nullable Output<String> policyDefinitionId) {
            $.policyDefinitionId = policyDefinitionId;
            return this;
        }

        /**
         * @param policyDefinitionId The ID of the Policy Definition or Policy Definition Set. Changing this forces a new Policy Assignment to be created.
         * 
         * @return builder
         * 
         */
        public Builder policyDefinitionId(String policyDefinitionId) {
            return policyDefinitionId(Output.of(policyDefinitionId));
        }

        public GroupPolicyAssignmentState build() {
            return $;
        }
    }

}
