#!/bin/sh

set -eu


usage () { # {{{
	cat <<-USAGE
usage: $0 -q QTDE_MAPAS -l LIMITE_SALAS

Este arquivo gera arquivos com configuração ambiente no formato JSON.
	
	USAGE
	exit 1
} # }}}

qtde_mapas=invalid
limite_salas=invalid

while getopts "q:l:h" OPTNAME ; do # {{{
	case $OPTNAME in
		l)
			limite_salas=$OPTARG
			;;
		q)
			qtde_mapas=$OPTARG
			;;
		h|*)
			usage
			;;
	esac
done
shift $(expr $OPTIND - 1)
OPTIND=1 # }}}

test $limite_salas != invalid || usage
test $qtde_mapas != invalid || usage

i = 0
while [ $i -lt $qtde_mapas ];
do
	j = 0
	while [ $j -lt ];
	do
		
	done
	i=$(($i+1))
done
