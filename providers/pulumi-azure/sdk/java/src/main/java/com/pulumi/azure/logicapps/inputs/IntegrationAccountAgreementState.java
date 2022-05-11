// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.logicapps.inputs;

import com.pulumi.azure.logicapps.inputs.IntegrationAccountAgreementGuestIdentityArgs;
import com.pulumi.azure.logicapps.inputs.IntegrationAccountAgreementHostIdentityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntegrationAccountAgreementState extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationAccountAgreementState Empty = new IntegrationAccountAgreementState();

    /**
     * The type of the Logic App Integration Account Agreement. Possible values are `AS2`, `X12` and `Edifact`.
     * 
     */
    @Import(name="agreementType")
    private @Nullable Output<String> agreementType;

    /**
     * @return The type of the Logic App Integration Account Agreement. Possible values are `AS2`, `X12` and `Edifact`.
     * 
     */
    public Optional<Output<String>> agreementType() {
        return Optional.ofNullable(this.agreementType);
    }

    /**
     * The content of the Logic App Integration Account Agreement.
     * 
     */
    @Import(name="content")
    private @Nullable Output<String> content;

    /**
     * @return The content of the Logic App Integration Account Agreement.
     * 
     */
    public Optional<Output<String>> content() {
        return Optional.ofNullable(this.content);
    }

    /**
     * A `guest_identity` block as documented below.
     * 
     */
    @Import(name="guestIdentity")
    private @Nullable Output<IntegrationAccountAgreementGuestIdentityArgs> guestIdentity;

    /**
     * @return A `guest_identity` block as documented below.
     * 
     */
    public Optional<Output<IntegrationAccountAgreementGuestIdentityArgs>> guestIdentity() {
        return Optional.ofNullable(this.guestIdentity);
    }

    /**
     * The name of the guest Logic App Integration Account Partner.
     * 
     */
    @Import(name="guestPartnerName")
    private @Nullable Output<String> guestPartnerName;

    /**
     * @return The name of the guest Logic App Integration Account Partner.
     * 
     */
    public Optional<Output<String>> guestPartnerName() {
        return Optional.ofNullable(this.guestPartnerName);
    }

    /**
     * A `host_identity` block as documented below.
     * 
     */
    @Import(name="hostIdentity")
    private @Nullable Output<IntegrationAccountAgreementHostIdentityArgs> hostIdentity;

    /**
     * @return A `host_identity` block as documented below.
     * 
     */
    public Optional<Output<IntegrationAccountAgreementHostIdentityArgs>> hostIdentity() {
        return Optional.ofNullable(this.hostIdentity);
    }

    /**
     * The name of the host Logic App Integration Account Partner.
     * 
     */
    @Import(name="hostPartnerName")
    private @Nullable Output<String> hostPartnerName;

    /**
     * @return The name of the host Logic App Integration Account Partner.
     * 
     */
    public Optional<Output<String>> hostPartnerName() {
        return Optional.ofNullable(this.hostPartnerName);
    }

    /**
     * The name of the Logic App Integration Account. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="integrationAccountName")
    private @Nullable Output<String> integrationAccountName;

    /**
     * @return The name of the Logic App Integration Account. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> integrationAccountName() {
        return Optional.ofNullable(this.integrationAccountName);
    }

    /**
     * The metadata of the Logic App Integration Account Agreement.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Map<String,String>> metadata;

    /**
     * @return The metadata of the Logic App Integration Account Agreement.
     * 
     */
    public Optional<Output<Map<String,String>>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * The name which should be used for this Logic App Integration Account Agreement. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Logic App Integration Account Agreement. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the Resource Group where the Logic App Integration Account Agreement should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Logic App Integration Account Agreement should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    private IntegrationAccountAgreementState() {}

    private IntegrationAccountAgreementState(IntegrationAccountAgreementState $) {
        this.agreementType = $.agreementType;
        this.content = $.content;
        this.guestIdentity = $.guestIdentity;
        this.guestPartnerName = $.guestPartnerName;
        this.hostIdentity = $.hostIdentity;
        this.hostPartnerName = $.hostPartnerName;
        this.integrationAccountName = $.integrationAccountName;
        this.metadata = $.metadata;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationAccountAgreementState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationAccountAgreementState $;

        public Builder() {
            $ = new IntegrationAccountAgreementState();
        }

        public Builder(IntegrationAccountAgreementState defaults) {
            $ = new IntegrationAccountAgreementState(Objects.requireNonNull(defaults));
        }

        /**
         * @param agreementType The type of the Logic App Integration Account Agreement. Possible values are `AS2`, `X12` and `Edifact`.
         * 
         * @return builder
         * 
         */
        public Builder agreementType(@Nullable Output<String> agreementType) {
            $.agreementType = agreementType;
            return this;
        }

        /**
         * @param agreementType The type of the Logic App Integration Account Agreement. Possible values are `AS2`, `X12` and `Edifact`.
         * 
         * @return builder
         * 
         */
        public Builder agreementType(String agreementType) {
            return agreementType(Output.of(agreementType));
        }

        /**
         * @param content The content of the Logic App Integration Account Agreement.
         * 
         * @return builder
         * 
         */
        public Builder content(@Nullable Output<String> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content The content of the Logic App Integration Account Agreement.
         * 
         * @return builder
         * 
         */
        public Builder content(String content) {
            return content(Output.of(content));
        }

        /**
         * @param guestIdentity A `guest_identity` block as documented below.
         * 
         * @return builder
         * 
         */
        public Builder guestIdentity(@Nullable Output<IntegrationAccountAgreementGuestIdentityArgs> guestIdentity) {
            $.guestIdentity = guestIdentity;
            return this;
        }

        /**
         * @param guestIdentity A `guest_identity` block as documented below.
         * 
         * @return builder
         * 
         */
        public Builder guestIdentity(IntegrationAccountAgreementGuestIdentityArgs guestIdentity) {
            return guestIdentity(Output.of(guestIdentity));
        }

        /**
         * @param guestPartnerName The name of the guest Logic App Integration Account Partner.
         * 
         * @return builder
         * 
         */
        public Builder guestPartnerName(@Nullable Output<String> guestPartnerName) {
            $.guestPartnerName = guestPartnerName;
            return this;
        }

        /**
         * @param guestPartnerName The name of the guest Logic App Integration Account Partner.
         * 
         * @return builder
         * 
         */
        public Builder guestPartnerName(String guestPartnerName) {
            return guestPartnerName(Output.of(guestPartnerName));
        }

        /**
         * @param hostIdentity A `host_identity` block as documented below.
         * 
         * @return builder
         * 
         */
        public Builder hostIdentity(@Nullable Output<IntegrationAccountAgreementHostIdentityArgs> hostIdentity) {
            $.hostIdentity = hostIdentity;
            return this;
        }

        /**
         * @param hostIdentity A `host_identity` block as documented below.
         * 
         * @return builder
         * 
         */
        public Builder hostIdentity(IntegrationAccountAgreementHostIdentityArgs hostIdentity) {
            return hostIdentity(Output.of(hostIdentity));
        }

        /**
         * @param hostPartnerName The name of the host Logic App Integration Account Partner.
         * 
         * @return builder
         * 
         */
        public Builder hostPartnerName(@Nullable Output<String> hostPartnerName) {
            $.hostPartnerName = hostPartnerName;
            return this;
        }

        /**
         * @param hostPartnerName The name of the host Logic App Integration Account Partner.
         * 
         * @return builder
         * 
         */
        public Builder hostPartnerName(String hostPartnerName) {
            return hostPartnerName(Output.of(hostPartnerName));
        }

        /**
         * @param integrationAccountName The name of the Logic App Integration Account. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder integrationAccountName(@Nullable Output<String> integrationAccountName) {
            $.integrationAccountName = integrationAccountName;
            return this;
        }

        /**
         * @param integrationAccountName The name of the Logic App Integration Account. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder integrationAccountName(String integrationAccountName) {
            return integrationAccountName(Output.of(integrationAccountName));
        }

        /**
         * @param metadata The metadata of the Logic App Integration Account Agreement.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata The metadata of the Logic App Integration Account Agreement.
         * 
         * @return builder
         * 
         */
        public Builder metadata(Map<String,String> metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param name The name which should be used for this Logic App Integration Account Agreement. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Logic App Integration Account Agreement. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Logic App Integration Account Agreement should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Logic App Integration Account Agreement should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public IntegrationAccountAgreementState build() {
            return $;
        }
    }

}
