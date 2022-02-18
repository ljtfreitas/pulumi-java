// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.RosettaNetPipBusinessDocumentResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The integration account RosettaNet ProcessConfiguration role settings.
 * 
 */
public final class RosettaNetPipRoleSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final RosettaNetPipRoleSettingsResponse Empty = new RosettaNetPipRoleSettingsResponse();

    /**
     * The action name.
     * 
     */
    @InputImport(name="action", required=true)
    private final String action;

    public String getAction() {
        return this.action;
    }

    /**
     * The RosettaNet ProcessConfiguration business document.
     * 
     */
    @InputImport(name="businessDocument", required=true)
    private final RosettaNetPipBusinessDocumentResponse businessDocument;

    public RosettaNetPipBusinessDocumentResponse getBusinessDocument() {
        return this.businessDocument;
    }

    /**
     * The description.
     * 
     */
    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The role name.
     * 
     */
    @InputImport(name="role", required=true)
    private final String role;

    public String getRole() {
        return this.role;
    }

    /**
     * The RosettaNet ProcessConfiguration role type.
     * 
     */
    @InputImport(name="roleType", required=true)
    private final String roleType;

    public String getRoleType() {
        return this.roleType;
    }

    /**
     * The service name.
     * 
     */
    @InputImport(name="service", required=true)
    private final String service;

    public String getService() {
        return this.service;
    }

    /**
     * The service classification name.
     * 
     */
    @InputImport(name="serviceClassification", required=true)
    private final String serviceClassification;

    public String getServiceClassification() {
        return this.serviceClassification;
    }

    public RosettaNetPipRoleSettingsResponse(
        String action,
        RosettaNetPipBusinessDocumentResponse businessDocument,
        @Nullable String description,
        String role,
        String roleType,
        String service,
        String serviceClassification) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.businessDocument = Objects.requireNonNull(businessDocument, "expected parameter 'businessDocument' to be non-null");
        this.description = description;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
        this.roleType = Objects.requireNonNull(roleType, "expected parameter 'roleType' to be non-null");
        this.service = Objects.requireNonNull(service, "expected parameter 'service' to be non-null");
        this.serviceClassification = Objects.requireNonNull(serviceClassification, "expected parameter 'serviceClassification' to be non-null");
    }

    private RosettaNetPipRoleSettingsResponse() {
        this.action = null;
        this.businessDocument = null;
        this.description = null;
        this.role = null;
        this.roleType = null;
        this.service = null;
        this.serviceClassification = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RosettaNetPipRoleSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private RosettaNetPipBusinessDocumentResponse businessDocument;
        private @Nullable String description;
        private String role;
        private String roleType;
        private String service;
        private String serviceClassification;

        public Builder() {
    	      // Empty
        }

        public Builder(RosettaNetPipRoleSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.businessDocument = defaults.businessDocument;
    	      this.description = defaults.description;
    	      this.role = defaults.role;
    	      this.roleType = defaults.roleType;
    	      this.service = defaults.service;
    	      this.serviceClassification = defaults.serviceClassification;
        }

        public Builder setAction(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setBusinessDocument(RosettaNetPipBusinessDocumentResponse businessDocument) {
            this.businessDocument = Objects.requireNonNull(businessDocument);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setRole(String role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder setRoleType(String roleType) {
            this.roleType = Objects.requireNonNull(roleType);
            return this;
        }

        public Builder setService(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }

        public Builder setServiceClassification(String serviceClassification) {
            this.serviceClassification = Objects.requireNonNull(serviceClassification);
            return this;
        }

        public RosettaNetPipRoleSettingsResponse build() {
            return new RosettaNetPipRoleSettingsResponse(action, businessDocument, description, role, roleType, service, serviceClassification);
        }
    }
}
