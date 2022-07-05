// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.managedidentities.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainArgs Empty = new DomainArgs();

    /**
     * Optional. The name of delegated administrator account used to perform Active Directory operations. If not specified, `setupadmin` will be used.
     * 
     */
    @Import(name="admin")
    private @Nullable Output<String> admin;

    /**
     * @return Optional. The name of delegated administrator account used to perform Active Directory operations. If not specified, `setupadmin` will be used.
     * 
     */
    public Optional<Output<String>> admin() {
        return Optional.ofNullable(this.admin);
    }

    /**
     * Optional. Configuration for audit logs. True if audit logs are enabled, else false. Default is audit logs disabled.
     * 
     */
    @Import(name="auditLogsEnabled")
    private @Nullable Output<Boolean> auditLogsEnabled;

    /**
     * @return Optional. Configuration for audit logs. True if audit logs are enabled, else false. Default is audit logs disabled.
     * 
     */
    public Optional<Output<Boolean>> auditLogsEnabled() {
        return Optional.ofNullable(this.auditLogsEnabled);
    }

    /**
     * Optional. The full names of the Google Compute Engine [networks](/compute/docs/networks-and-firewalls#networks) the domain instance is connected to. Networks can be added using UpdateDomain. The domain is only available on networks listed in `authorized_networks`. If CIDR subnets overlap between networks, domain creation will fail.
     * 
     */
    @Import(name="authorizedNetworks")
    private @Nullable Output<List<String>> authorizedNetworks;

    /**
     * @return Optional. The full names of the Google Compute Engine [networks](/compute/docs/networks-and-firewalls#networks) the domain instance is connected to. Networks can be added using UpdateDomain. The domain is only available on networks listed in `authorized_networks`. If CIDR subnets overlap between networks, domain creation will fail.
     * 
     */
    public Optional<Output<List<String>>> authorizedNetworks() {
        return Optional.ofNullable(this.authorizedNetworks);
    }

    /**
     * Required. The fully qualified domain name. e.g. mydomain.myorganization.com, with the following restrictions: * Must contain only lowercase letters, numbers, periods and hyphens. * Must start with a letter. * Must contain between 2-64 characters. * Must end with a number or a letter. * Must not start with period. * First segment length (mydomain for example above) shouldn&#39;t exceed 15 chars. * The last segment cannot be fully numeric. * Must be unique within the customer project.
     * 
     */
    @Import(name="domainName", required=true)
    private Output<String> domainName;

    /**
     * @return Required. The fully qualified domain name. e.g. mydomain.myorganization.com, with the following restrictions: * Must contain only lowercase letters, numbers, periods and hyphens. * Must start with a letter. * Must contain between 2-64 characters. * Must end with a number or a letter. * Must not start with period. * First segment length (mydomain for example above) shouldn&#39;t exceed 15 chars. * The last segment cannot be fully numeric. * Must be unique within the customer project.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }

    /**
     * Optional. Resource labels that can contain user-provided metadata.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Optional. Resource labels that can contain user-provided metadata.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Locations where domain needs to be provisioned. regions e.g. us-west1 or us-east4 Service supports up to 4 locations at once. Each location will use a /26 block.
     * 
     */
    @Import(name="locations", required=true)
    private Output<List<String>> locations;

    /**
     * @return Locations where domain needs to be provisioned. regions e.g. us-west1 or us-east4 Service supports up to 4 locations at once. Each location will use a /26 block.
     * 
     */
    public Output<List<String>> locations() {
        return this.locations;
    }

    /**
     * The unique name of the domain using the form: `projects/{project_id}/locations/global/domains/{domain_name}`.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The unique name of the domain using the form: `projects/{project_id}/locations/global/domains/{domain_name}`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The CIDR range of internal addresses that are reserved for this domain. Reserved networks must be /24 or larger. Ranges must be unique and non-overlapping with existing subnets in [Domain].[authorized_networks].
     * 
     */
    @Import(name="reservedIpRange", required=true)
    private Output<String> reservedIpRange;

    /**
     * @return The CIDR range of internal addresses that are reserved for this domain. Reserved networks must be /24 or larger. Ranges must be unique and non-overlapping with existing subnets in [Domain].[authorized_networks].
     * 
     */
    public Output<String> reservedIpRange() {
        return this.reservedIpRange;
    }

    private DomainArgs() {}

    private DomainArgs(DomainArgs $) {
        this.admin = $.admin;
        this.auditLogsEnabled = $.auditLogsEnabled;
        this.authorizedNetworks = $.authorizedNetworks;
        this.domainName = $.domainName;
        this.labels = $.labels;
        this.locations = $.locations;
        this.name = $.name;
        this.project = $.project;
        this.reservedIpRange = $.reservedIpRange;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainArgs $;

        public Builder() {
            $ = new DomainArgs();
        }

        public Builder(DomainArgs defaults) {
            $ = new DomainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param admin Optional. The name of delegated administrator account used to perform Active Directory operations. If not specified, `setupadmin` will be used.
         * 
         * @return builder
         * 
         */
        public Builder admin(@Nullable Output<String> admin) {
            $.admin = admin;
            return this;
        }

        /**
         * @param admin Optional. The name of delegated administrator account used to perform Active Directory operations. If not specified, `setupadmin` will be used.
         * 
         * @return builder
         * 
         */
        public Builder admin(String admin) {
            return admin(Output.of(admin));
        }

        /**
         * @param auditLogsEnabled Optional. Configuration for audit logs. True if audit logs are enabled, else false. Default is audit logs disabled.
         * 
         * @return builder
         * 
         */
        public Builder auditLogsEnabled(@Nullable Output<Boolean> auditLogsEnabled) {
            $.auditLogsEnabled = auditLogsEnabled;
            return this;
        }

        /**
         * @param auditLogsEnabled Optional. Configuration for audit logs. True if audit logs are enabled, else false. Default is audit logs disabled.
         * 
         * @return builder
         * 
         */
        public Builder auditLogsEnabled(Boolean auditLogsEnabled) {
            return auditLogsEnabled(Output.of(auditLogsEnabled));
        }

        /**
         * @param authorizedNetworks Optional. The full names of the Google Compute Engine [networks](/compute/docs/networks-and-firewalls#networks) the domain instance is connected to. Networks can be added using UpdateDomain. The domain is only available on networks listed in `authorized_networks`. If CIDR subnets overlap between networks, domain creation will fail.
         * 
         * @return builder
         * 
         */
        public Builder authorizedNetworks(@Nullable Output<List<String>> authorizedNetworks) {
            $.authorizedNetworks = authorizedNetworks;
            return this;
        }

        /**
         * @param authorizedNetworks Optional. The full names of the Google Compute Engine [networks](/compute/docs/networks-and-firewalls#networks) the domain instance is connected to. Networks can be added using UpdateDomain. The domain is only available on networks listed in `authorized_networks`. If CIDR subnets overlap between networks, domain creation will fail.
         * 
         * @return builder
         * 
         */
        public Builder authorizedNetworks(List<String> authorizedNetworks) {
            return authorizedNetworks(Output.of(authorizedNetworks));
        }

        /**
         * @param authorizedNetworks Optional. The full names of the Google Compute Engine [networks](/compute/docs/networks-and-firewalls#networks) the domain instance is connected to. Networks can be added using UpdateDomain. The domain is only available on networks listed in `authorized_networks`. If CIDR subnets overlap between networks, domain creation will fail.
         * 
         * @return builder
         * 
         */
        public Builder authorizedNetworks(String... authorizedNetworks) {
            return authorizedNetworks(List.of(authorizedNetworks));
        }

        /**
         * @param domainName Required. The fully qualified domain name. e.g. mydomain.myorganization.com, with the following restrictions: * Must contain only lowercase letters, numbers, periods and hyphens. * Must start with a letter. * Must contain between 2-64 characters. * Must end with a number or a letter. * Must not start with period. * First segment length (mydomain for example above) shouldn&#39;t exceed 15 chars. * The last segment cannot be fully numeric. * Must be unique within the customer project.
         * 
         * @return builder
         * 
         */
        public Builder domainName(Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName Required. The fully qualified domain name. e.g. mydomain.myorganization.com, with the following restrictions: * Must contain only lowercase letters, numbers, periods and hyphens. * Must start with a letter. * Must contain between 2-64 characters. * Must end with a number or a letter. * Must not start with period. * First segment length (mydomain for example above) shouldn&#39;t exceed 15 chars. * The last segment cannot be fully numeric. * Must be unique within the customer project.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        /**
         * @param labels Optional. Resource labels that can contain user-provided metadata.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Optional. Resource labels that can contain user-provided metadata.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param locations Locations where domain needs to be provisioned. regions e.g. us-west1 or us-east4 Service supports up to 4 locations at once. Each location will use a /26 block.
         * 
         * @return builder
         * 
         */
        public Builder locations(Output<List<String>> locations) {
            $.locations = locations;
            return this;
        }

        /**
         * @param locations Locations where domain needs to be provisioned. regions e.g. us-west1 or us-east4 Service supports up to 4 locations at once. Each location will use a /26 block.
         * 
         * @return builder
         * 
         */
        public Builder locations(List<String> locations) {
            return locations(Output.of(locations));
        }

        /**
         * @param locations Locations where domain needs to be provisioned. regions e.g. us-west1 or us-east4 Service supports up to 4 locations at once. Each location will use a /26 block.
         * 
         * @return builder
         * 
         */
        public Builder locations(String... locations) {
            return locations(List.of(locations));
        }

        /**
         * @param name The unique name of the domain using the form: `projects/{project_id}/locations/global/domains/{domain_name}`.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The unique name of the domain using the form: `projects/{project_id}/locations/global/domains/{domain_name}`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param reservedIpRange The CIDR range of internal addresses that are reserved for this domain. Reserved networks must be /24 or larger. Ranges must be unique and non-overlapping with existing subnets in [Domain].[authorized_networks].
         * 
         * @return builder
         * 
         */
        public Builder reservedIpRange(Output<String> reservedIpRange) {
            $.reservedIpRange = reservedIpRange;
            return this;
        }

        /**
         * @param reservedIpRange The CIDR range of internal addresses that are reserved for this domain. Reserved networks must be /24 or larger. Ranges must be unique and non-overlapping with existing subnets in [Domain].[authorized_networks].
         * 
         * @return builder
         * 
         */
        public Builder reservedIpRange(String reservedIpRange) {
            return reservedIpRange(Output.of(reservedIpRange));
        }

        public DomainArgs build() {
            $.domainName = Objects.requireNonNull($.domainName, "expected parameter 'domainName' to be non-null");
            $.locations = Objects.requireNonNull($.locations, "expected parameter 'locations' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.reservedIpRange = Objects.requireNonNull($.reservedIpRange, "expected parameter 'reservedIpRange' to be non-null");
            return $;
        }
    }

}
