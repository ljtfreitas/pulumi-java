// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.documentdb.TableResourceTableArgs;
import io.pulumi.azurenative.documentdb.outputs.TableGetPropertiesResponseOptions;
import io.pulumi.azurenative.documentdb.outputs.TableGetPropertiesResponseResource;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:documentdb:TableResourceTable")
public class TableResourceTable extends io.pulumi.resources.CustomResource {
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="options", type=TableGetPropertiesResponseOptions.class, parameters={})
    private Output</* @Nullable */ TableGetPropertiesResponseOptions> options;

    public Output</* @Nullable */ TableGetPropertiesResponseOptions> getOptions() {
        return this.options;
    }
    @OutputExport(name="resource", type=TableGetPropertiesResponseResource.class, parameters={})
    private Output</* @Nullable */ TableGetPropertiesResponseResource> resource;

    public Output</* @Nullable */ TableGetPropertiesResponseResource> getResource() {
        return this.resource;
    }
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public TableResourceTable(String name, TableResourceTableArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:TableResourceTable", name, args == null ? TableResourceTableArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private TableResourceTable(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:TableResourceTable", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:documentdb/v20150401:TableResourceTable").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20150408:TableResourceTable").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20151106:TableResourceTable").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20160319:TableResourceTable").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20160331:TableResourceTable").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20190801:TableResourceTable").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20191212:TableResourceTable").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20200301:TableResourceTable").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20200401:TableResourceTable").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20200601preview:TableResourceTable").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20200901:TableResourceTable").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210115:TableResourceTable").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210301preview:TableResourceTable").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210315:TableResourceTable").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210401preview:TableResourceTable").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210415:TableResourceTable").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210515:TableResourceTable").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210615:TableResourceTable").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20210701preview:TableResourceTable").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20211015:TableResourceTable").build()),
                Input.of(Alias.builder().setType("azure-native:documentdb/v20211015preview:TableResourceTable").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static TableResourceTable get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TableResourceTable(name, id, options);
    }
}