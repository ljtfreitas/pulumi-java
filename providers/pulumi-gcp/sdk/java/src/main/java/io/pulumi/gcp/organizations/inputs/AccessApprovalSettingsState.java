// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.organizations.inputs.AccessApprovalSettingsEnrolledServiceGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessApprovalSettingsState extends io.pulumi.resources.ResourceArgs {

    public static final AccessApprovalSettingsState Empty = new AccessApprovalSettingsState();

    /**
     * This field will always be unset for the organization since organizations do not have ancestors.
     * 
     */
    @InputImport(name="enrolledAncestor")
        private final @Nullable Input<Boolean> enrolledAncestor;

    public Input<Boolean> getEnrolledAncestor() {
        return this.enrolledAncestor == null ? Input.empty() : this.enrolledAncestor;
    }

    /**
     * A list of Google Cloud Services for which the given resource has Access Approval enrolled.
     * Access requests for the resource given by name against any of these services contained here will be required
     * to have explicit approval. Enrollment can be done for individual services.
     * A maximum of 10 enrolled services will be enforced, to be expanded as the set of supported services is expanded.
     * Structure is documented below.
     * 
     */
    @InputImport(name="enrolledServices")
        private final @Nullable Input<List<AccessApprovalSettingsEnrolledServiceGetArgs>> enrolledServices;

    public Input<List<AccessApprovalSettingsEnrolledServiceGetArgs>> getEnrolledServices() {
        return this.enrolledServices == null ? Input.empty() : this.enrolledServices;
    }

    /**
     * The resource name of the settings. Format is "organizations/{organization_id}/accessApprovalSettings"
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A list of email addresses to which notifications relating to approval requests should be sent.
     * Notifications relating to a resource will be sent to all emails in the settings of ancestor
     * resources of that resource. A maximum of 50 email addresses are allowed.
     * 
     */
    @InputImport(name="notificationEmails")
        private final @Nullable Input<List<String>> notificationEmails;

    public Input<List<String>> getNotificationEmails() {
        return this.notificationEmails == null ? Input.empty() : this.notificationEmails;
    }

    /**
     * ID of the organization of the access approval settings.
     * 
     */
    @InputImport(name="organizationId")
        private final @Nullable Input<String> organizationId;

    public Input<String> getOrganizationId() {
        return this.organizationId == null ? Input.empty() : this.organizationId;
    }

    public AccessApprovalSettingsState(
        @Nullable Input<Boolean> enrolledAncestor,
        @Nullable Input<List<AccessApprovalSettingsEnrolledServiceGetArgs>> enrolledServices,
        @Nullable Input<String> name,
        @Nullable Input<List<String>> notificationEmails,
        @Nullable Input<String> organizationId) {
        this.enrolledAncestor = enrolledAncestor;
        this.enrolledServices = enrolledServices;
        this.name = name;
        this.notificationEmails = notificationEmails;
        this.organizationId = organizationId;
    }

    private AccessApprovalSettingsState() {
        this.enrolledAncestor = Input.empty();
        this.enrolledServices = Input.empty();
        this.name = Input.empty();
        this.notificationEmails = Input.empty();
        this.organizationId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessApprovalSettingsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enrolledAncestor;
        private @Nullable Input<List<AccessApprovalSettingsEnrolledServiceGetArgs>> enrolledServices;
        private @Nullable Input<String> name;
        private @Nullable Input<List<String>> notificationEmails;
        private @Nullable Input<String> organizationId;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessApprovalSettingsState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enrolledAncestor = defaults.enrolledAncestor;
    	      this.enrolledServices = defaults.enrolledServices;
    	      this.name = defaults.name;
    	      this.notificationEmails = defaults.notificationEmails;
    	      this.organizationId = defaults.organizationId;
        }

        public Builder setEnrolledAncestor(@Nullable Input<Boolean> enrolledAncestor) {
            this.enrolledAncestor = enrolledAncestor;
            return this;
        }

        public Builder setEnrolledAncestor(@Nullable Boolean enrolledAncestor) {
            this.enrolledAncestor = Input.ofNullable(enrolledAncestor);
            return this;
        }

        public Builder setEnrolledServices(@Nullable Input<List<AccessApprovalSettingsEnrolledServiceGetArgs>> enrolledServices) {
            this.enrolledServices = enrolledServices;
            return this;
        }

        public Builder setEnrolledServices(@Nullable List<AccessApprovalSettingsEnrolledServiceGetArgs> enrolledServices) {
            this.enrolledServices = Input.ofNullable(enrolledServices);
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

        public Builder setNotificationEmails(@Nullable Input<List<String>> notificationEmails) {
            this.notificationEmails = notificationEmails;
            return this;
        }

        public Builder setNotificationEmails(@Nullable List<String> notificationEmails) {
            this.notificationEmails = Input.ofNullable(notificationEmails);
            return this;
        }

        public Builder setOrganizationId(@Nullable Input<String> organizationId) {
            this.organizationId = organizationId;
            return this;
        }

        public Builder setOrganizationId(@Nullable String organizationId) {
            this.organizationId = Input.ofNullable(organizationId);
            return this;
        }
        public AccessApprovalSettingsState build() {
            return new AccessApprovalSettingsState(enrolledAncestor, enrolledServices, name, notificationEmails, organizationId);
        }
    }
}
